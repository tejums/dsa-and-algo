Array.prototype.last = function() {
    const arrLength = this.length;
    return arrLength=== 0 ?-1 : this[arrLength - 1];
};

const arr = [1, 2, 3];
arr.last(); // 3
 