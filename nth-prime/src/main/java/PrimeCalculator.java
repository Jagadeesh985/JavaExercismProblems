class PrimeCalculator {

    int nth(int nth) {
        if(nth < 1){
            throw new IllegalArgumentException();
        }
        int primeCount = 0;
        int number=2;
        while (true){
            if(checkPrime(number)){
                primeCount++;
                if(primeCount == nth){
                    return number;
                }
            }
            number++;
        }
    }
    boolean checkPrime(int number){
        for(int num=2;num<=number/2;num++){
            if(number%num == 0){
                return false;
            }
        }
        return true;
    }

}
