var fruits = new Array();
fruits.push("Apple");
fruits.push("Mango");
fruits.push("Pineapple");
console.log("Array before removing: " + fruits);
fruits.shift();
console.log("Array after removing: " + fruits.join(","));