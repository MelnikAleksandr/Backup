//binary search will run with node
//save file as binarysearch2.js
//to run type "node binarysearch2.js
var randomInteger = function(val) {
	var ival = Math.random()*26+65;
	// console.log(ival);
	ival = Math.floor(ival);
	return ival;
}
// main (this is where functions get called)
var rInt;
var i;
for (i = 0; i < 65536; i++){
	rInt	= randomInteger();
	letter = String.fromCharCode(rInt);
	process.stdout.write(letter);
	//console.log(rInt+",");
	//doucumet.write( 5 + 6);
}
