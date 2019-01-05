package com.finwintech;

import com.finwintech.wsdl.GetBinInfoRequest;
import com.finwintech.wsdl.GetBinInfoResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class BinClient extends WebServiceGatewaySupport  {
	public GetBinInfoResponse getBinByBinNumber(String binNumber) {
		GetBinInfoRequest request = new GetBinInfoRequest();
		request.setBinNumber(binNumber);
		GetBinInfoResponse response = null;
		try {
			response = (GetBinInfoResponse) getWebServiceTemplate()
					.marshalSendAndReceive(request, new SoapActionCallback("http://localhost:8080/soapws/GetBinInfoRequest"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
}
