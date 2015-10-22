/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.validation.models;


/**
 * The Error model.
 */
public class Error {
    /**
     * The code property.
     */
    private Integer code;

    /**
     * The message property.
     */
    private String message;

    /**
     * The fields property.
     */
    private String fields;

    /**
     * Get the code value.
     *
     * @return the code value
     */ 
    public Integer getCode() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */ 
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Get the fields value.
     *
     * @return the fields value
     */ 
    public String getFields() {
        return this.fields;
    }

    /**
     * Set the fields value.
     *
     * @param fields the fields value to set
     */
    public void setFields(String fields) {
        this.fields = fields;
    }

}
