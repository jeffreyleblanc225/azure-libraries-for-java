/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.compute.implementation;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.CloudException;
import com.microsoft.azure.v2.OperationStatus;
import com.microsoft.azure.v2.management.compute.RequestRateByIntervalInput;
import com.microsoft.azure.v2.management.compute.ThrottledRequestsInput;
import com.microsoft.azure.v2.util.ServiceFutureUtil;
import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.OperationDescription;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.POST;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.ResumeOperation;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * LogAnalytics.
 */
public final class LogAnalyticsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private LogAnalyticsService service;

    /**
     * The service client containing this operation class.
     */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of LogAnalyticsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public LogAnalyticsInner(ComputeManagementClientImpl client) {
        this.service = AzureProxy.create(LogAnalyticsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for LogAnalytics to be used by
     * the proxy service to perform REST calls.
     */
    @Host("https://management.azure.com")
    private interface LogAnalyticsService {
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/logAnalytics/apiAccess/getRequestRateByInterval")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Observable<OperationStatus<LogAnalyticsOperationResultInner>> beginExportRequestRateByInterval(@PathParam("location") String location, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json; charset=utf-8") RequestRateByIntervalInput parameters, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @POST("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/logAnalytics/apiAccess/getRequestRateByInterval")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<LogAnalyticsOperationResultInner>> exportRequestRateByInterval(@PathParam("location") String location, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json; charset=utf-8") RequestRateByIntervalInput parameters, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @POST("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/logAnalytics/apiAccess/getRequestRateByInterval")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        @ResumeOperation
        Observable<OperationStatus<LogAnalyticsOperationResultInner>> resumeExportRequestRateByInterval(OperationDescription operationDescription);

        @POST("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/logAnalytics/apiAccess/getThrottledRequests")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Observable<OperationStatus<LogAnalyticsOperationResultInner>> beginExportThrottledRequests(@PathParam("location") String location, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json; charset=utf-8") ThrottledRequestsInput parameters, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @POST("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/logAnalytics/apiAccess/getThrottledRequests")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<LogAnalyticsOperationResultInner>> exportThrottledRequests(@PathParam("location") String location, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json; charset=utf-8") ThrottledRequestsInput parameters, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @POST("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/logAnalytics/apiAccess/getThrottledRequests")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        @ResumeOperation
        Observable<OperationStatus<LogAnalyticsOperationResultInner>> resumeExportThrottledRequests(OperationDescription operationDescription);
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LogAnalyticsOperationResultInner object if successful.
     */
    public LogAnalyticsOperationResultInner beginExportRequestRateByInterval(@NonNull String location, @NonNull RequestRateByIntervalInput parameters) {
        return beginExportRequestRateByIntervalAsync(location, parameters).blockingLast().result();
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the ServiceFuture&lt;LogAnalyticsOperationResultInner&gt; object.
     */
    public ServiceFuture<LogAnalyticsOperationResultInner> beginExportRequestRateByIntervalAsync(@NonNull String location, @NonNull RequestRateByIntervalInput parameters, ServiceCallback<LogAnalyticsOperationResultInner> serviceCallback) {
        return ServiceFutureUtil.fromLRO(beginExportRequestRateByIntervalAsync(location, parameters), serviceCallback);
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<LogAnalyticsOperationResultInner>> beginExportRequestRateByIntervalAsync(@NonNull String location, @NonNull RequestRateByIntervalInput parameters) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2018-06-01";
        return service.beginExportRequestRateByInterval(location, this.client.subscriptionId(), parameters, apiVersion, this.client.acceptLanguage());
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LogAnalyticsOperationResultInner object if successful.
     */
    public LogAnalyticsOperationResultInner exportRequestRateByInterval(@NonNull String location, @NonNull RequestRateByIntervalInput parameters) {
        return exportRequestRateByIntervalAsync(location, parameters).blockingGet();
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<LogAnalyticsOperationResultInner> exportRequestRateByIntervalAsync(@NonNull String location, @NonNull RequestRateByIntervalInput parameters, ServiceCallback<LogAnalyticsOperationResultInner> serviceCallback) {
        return ServiceFuture.fromBody(exportRequestRateByIntervalAsync(location, parameters), serviceCallback);
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<LogAnalyticsOperationResultInner>> exportRequestRateByIntervalWithRestResponseAsync(@NonNull String location, @NonNull RequestRateByIntervalInput parameters) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2018-06-01";
        return service.exportRequestRateByInterval(location, this.client.subscriptionId(), parameters, apiVersion, this.client.acceptLanguage());
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<LogAnalyticsOperationResultInner> exportRequestRateByIntervalAsync(@NonNull String location, @NonNull RequestRateByIntervalInput parameters) {
        return exportRequestRateByIntervalWithRestResponseAsync(location, parameters)
            .flatMapMaybe((BodyResponse<LogAnalyticsOperationResultInner> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling activities. (resume watch).
     *
     * @param operationDescription The OperationDescription object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<LogAnalyticsOperationResultInner>> resumeExportRequestRateByInterval(OperationDescription operationDescription) {
        if (operationDescription == null) {
            throw new IllegalArgumentException("Parameter operationDescription is required and cannot be null.");
        }
        return service.resumeExportRequestRateByInterval(operationDescription);
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LogAnalyticsOperationResultInner object if successful.
     */
    public LogAnalyticsOperationResultInner beginExportThrottledRequests(@NonNull String location, @NonNull ThrottledRequestsInput parameters) {
        return beginExportThrottledRequestsAsync(location, parameters).blockingLast().result();
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the ServiceFuture&lt;LogAnalyticsOperationResultInner&gt; object.
     */
    public ServiceFuture<LogAnalyticsOperationResultInner> beginExportThrottledRequestsAsync(@NonNull String location, @NonNull ThrottledRequestsInput parameters, ServiceCallback<LogAnalyticsOperationResultInner> serviceCallback) {
        return ServiceFutureUtil.fromLRO(beginExportThrottledRequestsAsync(location, parameters), serviceCallback);
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<LogAnalyticsOperationResultInner>> beginExportThrottledRequestsAsync(@NonNull String location, @NonNull ThrottledRequestsInput parameters) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2018-06-01";
        return service.beginExportThrottledRequests(location, this.client.subscriptionId(), parameters, apiVersion, this.client.acceptLanguage());
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LogAnalyticsOperationResultInner object if successful.
     */
    public LogAnalyticsOperationResultInner exportThrottledRequests(@NonNull String location, @NonNull ThrottledRequestsInput parameters) {
        return exportThrottledRequestsAsync(location, parameters).blockingGet();
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<LogAnalyticsOperationResultInner> exportThrottledRequestsAsync(@NonNull String location, @NonNull ThrottledRequestsInput parameters, ServiceCallback<LogAnalyticsOperationResultInner> serviceCallback) {
        return ServiceFuture.fromBody(exportThrottledRequestsAsync(location, parameters), serviceCallback);
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<LogAnalyticsOperationResultInner>> exportThrottledRequestsWithRestResponseAsync(@NonNull String location, @NonNull ThrottledRequestsInput parameters) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2018-06-01";
        return service.exportThrottledRequests(location, this.client.subscriptionId(), parameters, apiVersion, this.client.acceptLanguage());
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<LogAnalyticsOperationResultInner> exportThrottledRequestsAsync(@NonNull String location, @NonNull ThrottledRequestsInput parameters) {
        return exportThrottledRequestsWithRestResponseAsync(location, parameters)
            .flatMapMaybe((BodyResponse<LogAnalyticsOperationResultInner> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window. (resume watch).
     *
     * @param operationDescription The OperationDescription object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<LogAnalyticsOperationResultInner>> resumeExportThrottledRequests(OperationDescription operationDescription) {
        if (operationDescription == null) {
            throw new IllegalArgumentException("Parameter operationDescription is required and cannot be null.");
        }
        return service.resumeExportThrottledRequests(operationDescription);
    }
}