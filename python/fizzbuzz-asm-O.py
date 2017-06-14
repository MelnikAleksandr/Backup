for n in range (1,100):
	fb = ''
	if n % 3 == 0:
		fb += 'FIZZ'
	if n % 5 == 0:
		fb += 'BUZZ'
	if not fb:
		fb += str(n)
	print fb
