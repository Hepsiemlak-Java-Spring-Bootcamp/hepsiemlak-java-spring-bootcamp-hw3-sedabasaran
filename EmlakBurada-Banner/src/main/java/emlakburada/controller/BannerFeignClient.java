package emlakburada.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import emlakburada.dto.request.BannerRequest;
import emlakburada.dto.response.BannerResponse;

@FeignClient(url = "http://localhost:8081")
public interface BannerFeignClient {
	
	
	@PostMapping(value = "/banners")
	public ResponseEntity<BannerResponse> saveBanner(@RequestBody BannerRequest request);
	


}
