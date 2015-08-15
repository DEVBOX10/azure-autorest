/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.url;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import fixtures.url.models.UriColor;
import java.util.Date;
import java.util.List;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * An instance of this class provides access to all the operations defined
 * in Queries.
 */
public interface Queries {
    /**
     * The interface defining all the services for Queries to be
     * used by Retrofit to perform actually REST calls.
     */
    interface QueriesService {
        @GET("/queries/bool/true")
        Response getBooleanTrue(@Query("boolQuery") boolean boolQuery) throws ServiceException;

        @GET("/queries/bool/true")
        void getBooleanTrueAsync(@Query("boolQuery") boolean boolQuery, ServiceResponseCallback cb);

        @GET("/queries/bool/false")
        Response getBooleanFalse(@Query("boolQuery") boolean boolQuery) throws ServiceException;

        @GET("/queries/bool/false")
        void getBooleanFalseAsync(@Query("boolQuery") boolean boolQuery, ServiceResponseCallback cb);

        @GET("/queries/bool/null")
        Response getBooleanNull(@Query("boolQuery") boolean boolQuery) throws ServiceException;

        @GET("/queries/bool/null")
        void getBooleanNullAsync(@Query("boolQuery") boolean boolQuery, ServiceResponseCallback cb);

        @GET("/queries/int/1000000")
        Response getIntOneMillion(@Query("intQuery") int intQuery) throws ServiceException;

        @GET("/queries/int/1000000")
        void getIntOneMillionAsync(@Query("intQuery") int intQuery, ServiceResponseCallback cb);

        @GET("/queries/int/-1000000")
        Response getIntNegativeOneMillion(@Query("intQuery") int intQuery) throws ServiceException;

        @GET("/queries/int/-1000000")
        void getIntNegativeOneMillionAsync(@Query("intQuery") int intQuery, ServiceResponseCallback cb);

        @GET("/queries/int/null")
        Response getIntNull(@Query("intQuery") int intQuery) throws ServiceException;

        @GET("/queries/int/null")
        void getIntNullAsync(@Query("intQuery") int intQuery, ServiceResponseCallback cb);

        @GET("/queries/long/10000000000")
        Response getTenBillion(@Query("longQuery") long longQuery) throws ServiceException;

        @GET("/queries/long/10000000000")
        void getTenBillionAsync(@Query("longQuery") long longQuery, ServiceResponseCallback cb);

        @GET("/queries/long/-10000000000")
        Response getNegativeTenBillion(@Query("longQuery") long longQuery) throws ServiceException;

        @GET("/queries/long/-10000000000")
        void getNegativeTenBillionAsync(@Query("longQuery") long longQuery, ServiceResponseCallback cb);

        @GET("/queries/long/null")
        Response getLongNull(@Query("longQuery") long longQuery) throws ServiceException;

        @GET("/queries/long/null")
        void getLongNullAsync(@Query("longQuery") long longQuery, ServiceResponseCallback cb);

        @GET("/queries/float/1.034E+20")
        Response floatScientificPositive(@Query("floatQuery") double floatQuery) throws ServiceException;

        @GET("/queries/float/1.034E+20")
        void floatScientificPositiveAsync(@Query("floatQuery") double floatQuery, ServiceResponseCallback cb);

        @GET("/queries/float/-1.034E-20")
        Response floatScientificNegative(@Query("floatQuery") double floatQuery) throws ServiceException;

        @GET("/queries/float/-1.034E-20")
        void floatScientificNegativeAsync(@Query("floatQuery") double floatQuery, ServiceResponseCallback cb);

        @GET("/queries/float/null")
        Response floatNull(@Query("floatQuery") double floatQuery) throws ServiceException;

        @GET("/queries/float/null")
        void floatNullAsync(@Query("floatQuery") double floatQuery, ServiceResponseCallback cb);

        @GET("/queries/double/9999999.999")
        Response doubleDecimalPositive(@Query("doubleQuery") double doubleQuery) throws ServiceException;

        @GET("/queries/double/9999999.999")
        void doubleDecimalPositiveAsync(@Query("doubleQuery") double doubleQuery, ServiceResponseCallback cb);

        @GET("/queries/double/-9999999.999")
        Response doubleDecimalNegative(@Query("doubleQuery") double doubleQuery) throws ServiceException;

        @GET("/queries/double/-9999999.999")
        void doubleDecimalNegativeAsync(@Query("doubleQuery") double doubleQuery, ServiceResponseCallback cb);

        @GET("/queries/double/null")
        Response doubleNull(@Query("doubleQuery") double doubleQuery) throws ServiceException;

        @GET("/queries/double/null")
        void doubleNullAsync(@Query("doubleQuery") double doubleQuery, ServiceResponseCallback cb);

        @GET("/queries/string/unicode/")
        Response stringUnicode(@Query("stringQuery") String stringQuery) throws ServiceException;

        @GET("/queries/string/unicode/")
        void stringUnicodeAsync(@Query("stringQuery") String stringQuery, ServiceResponseCallback cb);

        @GET("/queries/string/begin%21%2A%27%28%29%3B%3A%40%20%26%3D%2B%24%2C%2F%3F%23%5B%5Dend")
        Response stringUrlEncoded(@Query("stringQuery") String stringQuery) throws ServiceException;

        @GET("/queries/string/begin%21%2A%27%28%29%3B%3A%40%20%26%3D%2B%24%2C%2F%3F%23%5B%5Dend")
        void stringUrlEncodedAsync(@Query("stringQuery") String stringQuery, ServiceResponseCallback cb);

        @GET("/queries/string/empty")
        Response stringEmpty(@Query("stringQuery") String stringQuery) throws ServiceException;

        @GET("/queries/string/empty")
        void stringEmptyAsync(@Query("stringQuery") String stringQuery, ServiceResponseCallback cb);

        @GET("/queries/string/null")
        Response stringNull(@Query("stringQuery") String stringQuery) throws ServiceException;

        @GET("/queries/string/null")
        void stringNullAsync(@Query("stringQuery") String stringQuery, ServiceResponseCallback cb);

        @GET("/queries/enum/green%20color")
        Response enumValid(@Query("enumQuery") UriColor enumQuery) throws ServiceException;

        @GET("/queries/enum/green%20color")
        void enumValidAsync(@Query("enumQuery") UriColor enumQuery, ServiceResponseCallback cb);

        @GET("/queries/enum/null")
        Response enumNull(@Query("enumQuery") UriColor enumQuery) throws ServiceException;

        @GET("/queries/enum/null")
        void enumNullAsync(@Query("enumQuery") UriColor enumQuery, ServiceResponseCallback cb);

        @GET("/queries/byte/multibyte")
        Response byteMultiByte(@Query("byteQuery") byte[] byteQuery) throws ServiceException;

        @GET("/queries/byte/multibyte")
        void byteMultiByteAsync(@Query("byteQuery") byte[] byteQuery, ServiceResponseCallback cb);

        @GET("/queries/byte/empty")
        Response byteEmpty(@Query("byteQuery") byte[] byteQuery) throws ServiceException;

        @GET("/queries/byte/empty")
        void byteEmptyAsync(@Query("byteQuery") byte[] byteQuery, ServiceResponseCallback cb);

        @GET("/queries/byte/null")
        Response byteNull(@Query("byteQuery") byte[] byteQuery) throws ServiceException;

        @GET("/queries/byte/null")
        void byteNullAsync(@Query("byteQuery") byte[] byteQuery, ServiceResponseCallback cb);

        @GET("/queries/date/2012-01-01")
        Response dateValid(@Query("dateQuery") Date dateQuery) throws ServiceException;

        @GET("/queries/date/2012-01-01")
        void dateValidAsync(@Query("dateQuery") Date dateQuery, ServiceResponseCallback cb);

        @GET("/queries/date/null")
        Response dateNull(@Query("dateQuery") Date dateQuery) throws ServiceException;

        @GET("/queries/date/null")
        void dateNullAsync(@Query("dateQuery") Date dateQuery, ServiceResponseCallback cb);

        @GET("/queries/datetime/2012-01-01T01%3A01%3A01Z")
        Response dateTimeValid(@Query("dateTimeQuery") Date dateTimeQuery) throws ServiceException;

        @GET("/queries/datetime/2012-01-01T01%3A01%3A01Z")
        void dateTimeValidAsync(@Query("dateTimeQuery") Date dateTimeQuery, ServiceResponseCallback cb);

        @GET("/queries/datetime/null")
        Response dateTimeNull(@Query("dateTimeQuery") Date dateTimeQuery) throws ServiceException;

        @GET("/queries/datetime/null")
        void dateTimeNullAsync(@Query("dateTimeQuery") Date dateTimeQuery, ServiceResponseCallback cb);

        @GET("/queries/array/csv/string/valid")
        Response arrayStringCsvValid(@Query("arrayQuery") List<String> arrayQuery) throws ServiceException;

        @GET("/queries/array/csv/string/valid")
        void arrayStringCsvValidAsync(@Query("arrayQuery") List<String> arrayQuery, ServiceResponseCallback cb);

        @GET("/queries/array/csv/string/null")
        Response arrayStringCsvNull(@Query("arrayQuery") List<String> arrayQuery) throws ServiceException;

        @GET("/queries/array/csv/string/null")
        void arrayStringCsvNullAsync(@Query("arrayQuery") List<String> arrayQuery, ServiceResponseCallback cb);

        @GET("/queries/array/csv/string/empty")
        Response arrayStringCsvEmpty(@Query("arrayQuery") List<String> arrayQuery) throws ServiceException;

        @GET("/queries/array/csv/string/empty")
        void arrayStringCsvEmptyAsync(@Query("arrayQuery") List<String> arrayQuery, ServiceResponseCallback cb);

        @GET("/queries/array/ssv/string/valid")
        Response arrayStringSsvValid(@Query("arrayQuery") List<String> arrayQuery) throws ServiceException;

        @GET("/queries/array/ssv/string/valid")
        void arrayStringSsvValidAsync(@Query("arrayQuery") List<String> arrayQuery, ServiceResponseCallback cb);

        @GET("/queries/array/tsv/string/valid")
        Response arrayStringTsvValid(@Query("arrayQuery") List<String> arrayQuery) throws ServiceException;

        @GET("/queries/array/tsv/string/valid")
        void arrayStringTsvValidAsync(@Query("arrayQuery") List<String> arrayQuery, ServiceResponseCallback cb);

        @GET("/queries/array/pipes/string/valid")
        Response arrayStringPipesValid(@Query("arrayQuery") List<String> arrayQuery) throws ServiceException;

        @GET("/queries/array/pipes/string/valid")
        void arrayStringPipesValidAsync(@Query("arrayQuery") List<String> arrayQuery, ServiceResponseCallback cb);

    }
    /**
     * Get true Boolean value on path
     *
     * @param boolQuery true boolean value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void getBooleanTrue(boolean boolQuery) throws ServiceException;

    /**
     * Get true Boolean value on path
     *
     * @param boolQuery true boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getBooleanTrueAsync(boolean boolQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get false Boolean value on path
     *
     * @param boolQuery false boolean value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void getBooleanFalse(boolean boolQuery) throws ServiceException;

    /**
     * Get false Boolean value on path
     *
     * @param boolQuery false boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getBooleanFalseAsync(boolean boolQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null Boolean value on query (query string should be absent)
     *
     * @param boolQuery null boolean value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void getBooleanNull(boolean boolQuery) throws ServiceException;

    /**
     * Get null Boolean value on query (query string should be absent)
     *
     * @param boolQuery null boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getBooleanNullAsync(boolean boolQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '1000000' integer value
     *
     * @param intQuery '1000000' integer value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void getIntOneMillion(int intQuery) throws ServiceException;

    /**
     * Get '1000000' integer value
     *
     * @param intQuery '1000000' integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getIntOneMillionAsync(int intQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-1000000' integer value
     *
     * @param intQuery '-1000000' integer value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void getIntNegativeOneMillion(int intQuery) throws ServiceException;

    /**
     * Get '-1000000' integer value
     *
     * @param intQuery '-1000000' integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getIntNegativeOneMillionAsync(int intQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null integer value (no query parameter)
     *
     * @param intQuery null integer value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void getIntNull(int intQuery) throws ServiceException;

    /**
     * Get null integer value (no query parameter)
     *
     * @param intQuery null integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getIntNullAsync(int intQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '10000000000' 64 bit integer value
     *
     * @param longQuery '10000000000' 64 bit integer value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void getTenBillion(long longQuery) throws ServiceException;

    /**
     * Get '10000000000' 64 bit integer value
     *
     * @param longQuery '10000000000' 64 bit integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getTenBillionAsync(long longQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-10000000000' 64 bit integer value
     *
     * @param longQuery '-10000000000' 64 bit integer value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void getNegativeTenBillion(long longQuery) throws ServiceException;

    /**
     * Get '-10000000000' 64 bit integer value
     *
     * @param longQuery '-10000000000' 64 bit integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getNegativeTenBillionAsync(long longQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get 'null 64 bit integer value (no query param in uri)
     *
     * @param longQuery null 64 bit integer value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void getLongNull(long longQuery) throws ServiceException;

    /**
     * Get 'null 64 bit integer value (no query param in uri)
     *
     * @param longQuery null 64 bit integer value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void getLongNullAsync(long longQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '1.034E+20' numeric value
     *
     * @param floatQuery '1.034E+20'numeric value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void floatScientificPositive(double floatQuery) throws ServiceException;

    /**
     * Get '1.034E+20' numeric value
     *
     * @param floatQuery '1.034E+20'numeric value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void floatScientificPositiveAsync(double floatQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-1.034E-20' numeric value
     *
     * @param floatQuery '-1.034E-20'numeric value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void floatScientificNegative(double floatQuery) throws ServiceException;

    /**
     * Get '-1.034E-20' numeric value
     *
     * @param floatQuery '-1.034E-20'numeric value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void floatScientificNegativeAsync(double floatQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null numeric value (no query parameter)
     *
     * @param floatQuery null numeric value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void floatNull(double floatQuery) throws ServiceException;

    /**
     * Get null numeric value (no query parameter)
     *
     * @param floatQuery null numeric value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void floatNullAsync(double floatQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '9999999.999' numeric value
     *
     * @param doubleQuery '9999999.999'numeric value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void doubleDecimalPositive(double doubleQuery) throws ServiceException;

    /**
     * Get '9999999.999' numeric value
     *
     * @param doubleQuery '9999999.999'numeric value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void doubleDecimalPositiveAsync(double doubleQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '-9999999.999' numeric value
     *
     * @param doubleQuery '-9999999.999'numeric value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void doubleDecimalNegative(double doubleQuery) throws ServiceException;

    /**
     * Get '-9999999.999' numeric value
     *
     * @param doubleQuery '-9999999.999'numeric value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void doubleDecimalNegativeAsync(double doubleQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null numeric value (no query parameter)
     *
     * @param doubleQuery null numeric value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void doubleNull(double doubleQuery) throws ServiceException;

    /**
     * Get null numeric value (no query parameter)
     *
     * @param doubleQuery null numeric value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void doubleNullAsync(double doubleQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value
     *
     * @param stringQuery '啊齄丂狛狜隣郎隣兀﨩'multi-byte string value. Possible values for this parameter include: '啊齄丂狛狜隣郎隣兀﨩'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void stringUnicode(String stringQuery) throws ServiceException;

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multi-byte string value
     *
     * @param stringQuery '啊齄丂狛狜隣郎隣兀﨩'multi-byte string value. Possible values for this parameter include: '啊齄丂狛狜隣郎隣兀﨩'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void stringUnicodeAsync(String stringQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end
     *
     * @param stringQuery 'begin!*'();:@ &amp;=+$,/?#[]end' url encoded string value. Possible values for this parameter include: 'begin!*'();:@ &amp;=+$,/?#[]end'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void stringUrlEncoded(String stringQuery) throws ServiceException;

    /**
     * Get 'begin!*'();:@ &amp;=+$,/?#[]end
     *
     * @param stringQuery 'begin!*'();:@ &amp;=+$,/?#[]end' url encoded string value. Possible values for this parameter include: 'begin!*'();:@ &amp;=+$,/?#[]end'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void stringUrlEncodedAsync(String stringQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get ''
     *
     * @param stringQuery '' string value. Possible values for this parameter include: ''
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void stringEmpty(String stringQuery) throws ServiceException;

    /**
     * Get ''
     *
     * @param stringQuery '' string value. Possible values for this parameter include: ''
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void stringEmptyAsync(String stringQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null (no query parameter in url)
     *
     * @param stringQuery null string value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void stringNull(String stringQuery) throws ServiceException;

    /**
     * Get null (no query parameter in url)
     *
     * @param stringQuery null string value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void stringNullAsync(String stringQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get using uri with query parameter 'green color'
     *
     * @param enumQuery 'green color' enum value. Possible values for this parameter include: 'red color', 'green color', 'blue color'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void enumValid(UriColor enumQuery) throws ServiceException;

    /**
     * Get using uri with query parameter 'green color'
     *
     * @param enumQuery 'green color' enum value. Possible values for this parameter include: 'red color', 'green color', 'blue color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void enumValidAsync(UriColor enumQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null (no query parameter in url)
     *
     * @param enumQuery null string value. Possible values for this parameter include: 'red color', 'green color', 'blue color'
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void enumNull(UriColor enumQuery) throws ServiceException;

    /**
     * Get null (no query parameter in url)
     *
     * @param enumQuery null string value. Possible values for this parameter include: 'red color', 'green color', 'blue color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void enumNullAsync(UriColor enumQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     *
     * @param byteQuery '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void byteMultiByte(byte[] byteQuery) throws ServiceException;

    /**
     * Get '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     *
     * @param byteQuery '啊齄丂狛狜隣郎隣兀﨩' multibyte value as utf-8 encoded byte array
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void byteMultiByteAsync(byte[] byteQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '' as byte array
     *
     * @param byteQuery '' as byte array
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void byteEmpty(byte[] byteQuery) throws ServiceException;

    /**
     * Get '' as byte array
     *
     * @param byteQuery '' as byte array
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void byteEmptyAsync(byte[] byteQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null as byte array (no query parameters in uri)
     *
     * @param byteQuery null as byte array (no query parameters in uri)
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void byteNull(byte[] byteQuery) throws ServiceException;

    /**
     * Get null as byte array (no query parameters in uri)
     *
     * @param byteQuery null as byte array (no query parameters in uri)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void byteNullAsync(byte[] byteQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '2012-01-01' as date
     *
     * @param dateQuery '2012-01-01' as date
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void dateValid(Date dateQuery) throws ServiceException;

    /**
     * Get '2012-01-01' as date
     *
     * @param dateQuery '2012-01-01' as date
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void dateValidAsync(Date dateQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null as date - this should result in no query parameters in uri
     *
     * @param dateQuery null as date (no query parameters in uri)
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void dateNull(Date dateQuery) throws ServiceException;

    /**
     * Get null as date - this should result in no query parameters in uri
     *
     * @param dateQuery null as date (no query parameters in uri)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void dateNullAsync(Date dateQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get '2012-01-01T01:01:01Z' as date-time
     *
     * @param dateTimeQuery '2012-01-01T01:01:01Z' as date-time
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void dateTimeValid(Date dateTimeQuery) throws ServiceException;

    /**
     * Get '2012-01-01T01:01:01Z' as date-time
     *
     * @param dateTimeQuery '2012-01-01T01:01:01Z' as date-time
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void dateTimeValidAsync(Date dateTimeQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get null as date-time, should result in no query parameters in uri
     *
     * @param dateTimeQuery null as date-time (no query parameters)
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void dateTimeNull(Date dateTimeQuery) throws ServiceException;

    /**
     * Get null as date-time, should result in no query parameters in uri
     *
     * @param dateTimeQuery null as date-time (no query parameters)
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void dateTimeNullAsync(Date dateTimeQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@
     * &amp;=+$,/?#[]end' , null, ''] using the csv-array format
     *
     * @param arrayQuery an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void arrayStringCsvValid(List<String> arrayQuery) throws ServiceException;

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@
     * &amp;=+$,/?#[]end' , null, ''] using the csv-array format
     *
     * @param arrayQuery an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the csv-array format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void arrayStringCsvValidAsync(List<String> arrayQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a null array of string using the csv-array format
     *
     * @param arrayQuery a null array of string using the csv-array format
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void arrayStringCsvNull(List<String> arrayQuery) throws ServiceException;

    /**
     * Get a null array of string using the csv-array format
     *
     * @param arrayQuery a null array of string using the csv-array format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void arrayStringCsvNullAsync(List<String> arrayQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get an empty array [] of string using the csv-array format
     *
     * @param arrayQuery an empty array [] of string using the csv-array format
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void arrayStringCsvEmpty(List<String> arrayQuery) throws ServiceException;

    /**
     * Get an empty array [] of string using the csv-array format
     *
     * @param arrayQuery an empty array [] of string using the csv-array format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void arrayStringCsvEmptyAsync(List<String> arrayQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@
     * &amp;=+$,/?#[]end' , null, ''] using the ssv-array format
     *
     * @param arrayQuery an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the ssv-array format
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void arrayStringSsvValid(List<String> arrayQuery) throws ServiceException;

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@
     * &amp;=+$,/?#[]end' , null, ''] using the ssv-array format
     *
     * @param arrayQuery an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the ssv-array format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void arrayStringSsvValidAsync(List<String> arrayQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@
     * &amp;=+$,/?#[]end' , null, ''] using the tsv-array format
     *
     * @param arrayQuery an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the tsv-array format
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void arrayStringTsvValid(List<String> arrayQuery) throws ServiceException;

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@
     * &amp;=+$,/?#[]end' , null, ''] using the tsv-array format
     *
     * @param arrayQuery an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the tsv-array format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void arrayStringTsvValidAsync(List<String> arrayQuery, final ServiceCallback<Void> serviceCallback);

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@
     * &amp;=+$,/?#[]end' , null, ''] using the pipes-array format
     *
     * @param arrayQuery an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the pipes-array format
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void arrayStringPipesValid(List<String> arrayQuery) throws ServiceException;

    /**
     * Get an array of string ['ArrayQuery1', 'begin!*'();:@
     * &amp;=+$,/?#[]end' , null, ''] using the pipes-array format
     *
     * @param arrayQuery an array of string ['ArrayQuery1', 'begin!*'();:@ &amp;=+$,/?#[]end' , null, ''] using the pipes-array format
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void arrayStringPipesValidAsync(List<String> arrayQuery, final ServiceCallback<Void> serviceCallback);

}
