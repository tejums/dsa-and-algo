/**
 * @param {any} obj
 * @param {any} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function(obj, classFunction) {
     if(obj === null || obj === undefined || classFunction === null ||      classFunction === undefined || typeof classFunction !== 'function'){
        return false
    }
    else{
        return Object(obj) instanceof classFunction
    }
};

/**
 * checkIfInstanceOf(new Date(), Date); // true
 */