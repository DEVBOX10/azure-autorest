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

var util = require('util');

/**
 * @class
 * Initializes a new instance of the Product class.
 * @constructor
 * The product documentation.
 * @member {array} [displayNames] Non required array of unique items from 0 to
 * 6 elements.
 * 
 * @member {number} [capacity] Non required int betwen 0 and 100 exclusive.
 * 
 * @member {string} [image] Image URL representing the product.
 * 
 */
function Product(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.displayNames) {
      var tempParametersdisplayNames = [];
      parameters.displayNames.forEach(function(element) {
        if (element !== undefined) {
          element = element;
        }
        tempParametersdisplayNames.push(element);
      });
      this.displayNames = tempParametersdisplayNames;
    }
    if (parameters.capacity !== undefined) {
      this.capacity = parameters.capacity;
    }
    if (parameters.image !== undefined) {
      this.image = parameters.image;
    }
  }    
}


/**
 * Validate the payload against the Product schema
 *
 * @param {JSON} payload
 *
 */
Product.prototype.serialize = function () {
  var payload = {};
  if (util.isArray(this['displayNames'])) {
    payload['display_names'] = [];
    for (var i = 0; i < this['displayNames'].length; i++) {
      if (this['displayNames'][i] !== null && this['displayNames'][i] !== undefined) {
        if (typeof this['displayNames'][i].valueOf() !== 'string') {
          throw new Error('this[\'displayNames\'][i] must be of type string.');
        }
        if (payload['display_names'] === null || payload['display_names'] === undefined) {
          payload['display_names'] = {};
        }
        payload['display_names'][i] = this['displayNames'][i];
      }
    }
  }

  if (this['capacity'] !== null && this['capacity'] !== undefined) {
    if (typeof this['capacity'] !== 'number') {
      throw new Error('this[\'capacity\'] must be of type number.');
    }
    payload['capacity'] = this['capacity'];
  }

  if (this['image'] !== null && this['image'] !== undefined) {
    if (typeof this['image'].valueOf() !== 'string') {
      throw new Error('this[\'image\'] must be of type string.');
    }
    payload['image'] = this['image'];
  }

  return payload;
};

/**
 * Deserialize the instance to Product schema
 *
 * @param {JSON} instance
 *
 */
Product.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance['display_names']) {
      var tempInstancedisplayNames = [];
      instance['display_names'].forEach(function(element1) {
        if (element1 !== undefined) {
          element1 = element1;
        }
        tempInstancedisplayNames.push(element1);
      });
      this['displayNames'] = tempInstancedisplayNames;
    }

    if (instance['capacity'] !== undefined) {
      this['capacity'] = instance['capacity'];
    }

    if (instance['image'] !== undefined) {
      this['image'] = instance['image'];
    }
  }

  return this;
};

module.exports = Product;
