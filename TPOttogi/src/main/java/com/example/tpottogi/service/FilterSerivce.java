package com.example.tpottogi.Service;

import com.example.tpottogi.dto.ProductDetailDto;
import com.example.tpottogi.dto.ProductDto;
import com.example.tpottogi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
public class FilterSerivce {
    private final ProductRepository productRepository;
    private final SituationRepository situationRepository;
    private final sttPrdRepository sttprdRepository;

    @Autowired
    public FilterSerivce(ProductRepository productRepository, SituationRepository situationRepository, sttPrdRepository sttprdRepository) {
        this.productRepository = productRepository;
        this.situationRepository = situationRepository;
        this.sttprdRepository=sttprdRepository;
    }

    //상황별 키워드 선택 시 음식 리스트 조회
    public List<ProductDto> keywordFoods(Long id){
        Situation situation=situationRepository.findById(id).get();
        List<sttPrd> sttPrds=sttprdRepository.findBySituation(situation);

        List<ProductDto> productDtos=new ArrayList<>();

        for(sttPrd sttprd:sttPrds){
            Product product=sttprd.getProduct();
            String cleanedFileName = product.getName_en().replaceAll("[^\\w]", "");
            String imageUrl="https://tpottogi.s3.ap-northeast-2.amazonaws.com/product/"+cleanedFileName+ ".jpg";
            ProductDto productDto=new ProductDto(product.getId(), imageUrl, product.getName_en());
            productDtos.add(productDto);
        }
        productDtos=productDtos.stream().sorted(Comparator.comparing(ProductDto::getId)).collect(Collectors.toList());
        return productDtos;
    }

    //제품 선택 시 상세 페이지 정보
    public ProductDetailDto productDetail(Long id){
        Product product=productRepository.findById(id).get();
        String cleanedFileName = product.getName_en().replaceAll("[^\\w]", "");
        String imageUrl="https://tpottogi.s3.ap-northeast-2.amazonaws.com/product/"+cleanedFileName+ ".jpg";
        ProductDetailDto productDetailDto=new ProductDetailDto(product.getId(), product.getName_en(), product.getFood_en(), product.getFood_kr(), imageUrl);
        return productDetailDto;
    }

}