/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

import { ServiceClientOptions, RequestOptions, WebResource } from "ms-rest";
import * as operations from "./operations";

export default class AutoRestSwaggerBATdictionaryService {
    /**
     * @class
     * Initializes a new instance of the AutoRestSwaggerBATdictionaryService class.
     * @constructor
     *
     * @param {string} [baseUri] - The base URI of the service.
     *
     * @param {object} [options] - The parameter options
     *
     * @param {Array} [options.filters] - Filters to be added to the request pipeline
     *
     * @param {object} [options.requestOptions] - Options for the underlying request object
     * {@link https://github.com/request/request#requestoptions-callback Options doc}
     *
     * @param {bool} [options.noRetryPolicy] - If set to true, turn off default retry policy
     */
    constructor(baseUri: string, options: ServiceClientOptions);

    // Operation groups
    dictionary: operations.Dictionary;
    }
