package com.finwintech.endpoints;

import com.finwintech.gs_ws.GetBinInfoRequest;
import com.finwintech.gs_ws.GetBinInfoResponse;
import com.finwintech.service.IBinService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BinEndpoint {
	private static final String NAMESPACE_URI = "http://www.finwintech.com/bin-ws";
	@Autowired
	private IBinService binService;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetBinInfoRequest")
	@ResponsePayload
	public GetBinInfoResponse getBin(@RequestPayload GetBinInfoRequest request) {
		GetBinInfoResponse response = new GetBinInfoResponse();
		BeanUtils.copyProperties(binService.getBinByBinNumber(request.getBinNumber()), response);
		System.out.println(">>>>>>>>>>>>>>>>>");
		System.out.println("BIN: " + request.getBinNumber());
		System.out.println(">>>>>>>>>>>>>>>>>");
		System.out.println("Bank Country Name: " + response.getBankCountryName());
		System.out.println(">>>>>>>>>>>>>>>>>");
		System.out.println("Bank Issuing: " + response.getBankIssuing());
		System.out.println(">>>>>>>>>>>>>>>>>");
		return response;
	}
}
