package com.biradar.msscbrewservice.web.controller;

import com.biradar.msscbrewservice.web.model.BeerDTO;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BeerPagedList extends PageImpl<BeerDTO> {


    public BeerPagedList(List<BeerDTO> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPagedList(List<BeerDTO> content) {
        super(content);
    }
}
