<?php 
// PHP Program to find root of an 
// equations using secant method 

// function takes value of x 
// and returns f(x) 
function f( $x) 
{ 
	$f = exp(-$x) - $x; 
	return $f; 
} 

function secant($x1, $x2, $E) 
{ 
	$n = 0; $xm; 
	$x0; $c; 
	if (f($x1) * f($x2) < 0) 
	{ 
		do { 
			
			// calculate the intermediate value 
			$x0 = ($x1 * f($x2) - $x2 * 
				f($x1)) / (f($x2) - f($x1)); 

			// check if x0 is root 
			// of equation or not 
			$c = f($x1) * f($x0); 

			// update the value of interval 
			$x1 = $x2; 
			$x2 = $x0; 

			// update number of iteration 
			$n++; 

			// if x0 is the root of equation 
			// then break the loop 
			if ($c == 0) 
				break; 
			$xm = ($x1 * f($x2) - $x2 * f($x1)) / 
							(f($x2) - f($x1)); 
								
		// repeat the loop 
		// until the convergence 
		} while (abs($xm - $x0) >= $E); 

		echo "Root of the given equation=". $x0."\n" ; 
		echo "No. of iterations = ". $n ; 
		
	} else
		echo "Can not find a root in the given inteval"; 
} 

// Driver code 
{ 
	
	// initializing the values 
	$x1 = 0; $x2 = 1; 
	$E = 0.0001; 
	secant($x1, $x2, $E); 
	return 0; 
}  
?> 
