package com.binance.api.client.config;

/**
 * Configuration used for Binance operations.
 */
public class BinanceApiConfig {

	/**
	 * Base domain for web sockets.
	 */
	private static String BASE_STREAMS_URL = "wss://stream.binance.com:9443/ws";

	/**
	 * Base domain for rest api.
	 */
	private static String BASE_REST_URL = "https://api.binance.com";

	/**
	 * Base domain for asset calls
	 */
	private static final String BASE_ASSET_URL = "https://binance.com";

	/**
	 * Set the URL base domain name (e.g., binance.com).
	 *
	 * @param baseStreamsDomain Base domain name to use with web sockets
	 * @param baseRestDomain Base domain name to use with the rest api
	 */
	public static void setBaseDomains(String baseStreamsDomain, String baseRestDomain) {
		BASE_STREAMS_URL = baseStreamsDomain;
		BASE_REST_URL = baseRestDomain;
	}

	/**
	 * REST API base URL.
	 */
	public static String getApiBaseUrl() {
		return BASE_REST_URL;
	}

	/**
	 * Streaming API base URL.
	 */
	public static String getStreamApiBaseUrl() {
		return BASE_STREAMS_URL;
	}

	/**
	 * Asset info base URL.
	 */
	public static String getAssetInfoApiBaseUrl() {
		return BASE_ASSET_URL;
	}

}
