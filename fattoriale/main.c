
// un metodo possibile
int fattoriale(int n) {
	int ris = n;
	if (n == 0 || n == 1) {
		return 1;
	}
	for (int i = 2; i < n; i++) {
		ris *= i;
	}
	return ris;
}



int main() {
	int n; 
	int f = fattoriale(2); 
	f = fattoriale(3);
	f = fattoriale(4);
	f = fattoriale(12);
	return 0; 
}