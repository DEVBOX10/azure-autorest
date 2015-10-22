/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.12.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * @class
 * Initializes a new instance of the StringWrapper class.
 * @constructor
 * @member {string} value
 * 
 */
function StringWrapper(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.value !== undefined) {
      this.value = parameters.value;
    }
  }    
}


/**
 * Validate the payload against the StringWrapper schema
 *
 * @param {JSON} payload
 *
 */
StringWrapper.prototype.serialize = function () {
  var payload = {};
  if (this['value'] === null || this['value'] === undefined || typeof this['value'].valueOf() !== 'string') {
    throw new Error('this[\'value\'] cannot be null or undefined and it must be of type string.');
  }
  payload['value'] = this['value'];

  return payload;
};

/**
 * Deserialize the instance to StringWrapper schema
 *
 * @param {JSON} instance
 *
 */
StringWrapper.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['value'] !== undefined) {
      this['value'] = instance['value'];
    }
  }

  return this;
};

module.exports = StringWrapper;
