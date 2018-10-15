/**
 * 
 */

String.prototype.startsWith = function(str) {
	/**Check if the index of the str string is 0*/
	return this.indexOf(str) == 0;
};

String.prototype.endsWith = function(str) {
	/**Check if the index of the str is length of the whole string - length of the str.*/
	return this.indexOf(str) == ((this.length) - (str.length));
};



const sample1 = 'hang the dj';

console.log(sample1.endsWith('42'));