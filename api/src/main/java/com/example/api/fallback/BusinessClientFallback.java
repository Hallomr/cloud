package com.example.api.fallback;

import com.example.api.service.BusinessClient;
import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class BusinessClientFallback implements BusinessClient {
    @Override
    public String business() {
        return HttpStatus.FORBIDDEN.getReasonPhrase();
    }
}
