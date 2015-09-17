class Complex:
	real = None
	imaginary = None

	def __init__(self,r,i):
		self.real = float(r)
		self.imaginary = float(i)

	def __str__(self):
	
		if self.real ==0.0:
			return "%.2fi" % self.imaginary
		elif self.imaginary < 0:
			return "%.2f - %.2fi" % (self.real,-self.imaginary)
		else:
			return "%.2f + %.2fi" % (self.real,self.imaginary)

	def __repr__(self):
		return str(self)

	def __add__(self, other):
		return Complex(self.real + other.real, self.imaginary + other.imaginary)




