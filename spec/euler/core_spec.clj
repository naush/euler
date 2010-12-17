(ns euler.core-spec
  (:use
    [speclj.core]
    [euler.core]))

(describe "Fibonacci sequence"

  (it "1st term of Fibonacci is 1"
    (should (= 1 (euler.core/nth-fib 1))))

  (it "2nd term of Fibonacci is 2"
    (should (= 2 (euler.core/nth-fib 2))))

  (it "4th term of Fibonacci is 5"
    (should (= 5 (euler.core/nth-fib 4))))

  (it "10th term of Fibonacci is 89"
    (should (= 89 (euler.core/nth-fib 10)))))

(run-specs)

(describe "Sum of even Fibonacci terms"

  (it "up to 10"
    (should (= 10 (euler.core/sum-even-fib-upto 10 0 0))))

  (it "up to 4e6"
    (should (= 4613732 (euler.core/sum-even-fib-upto 4e6 0 0)))))

(run-specs)

(describe "Factor?"

  (it "2 is a factor of 10"
    (should (euler.core/factor? 10 2)))

  (it "3 is not a factor of 10"
    (should-not (euler.core/factor? 10 3))))

(describe "Prime?"

  (it "2 is a prime"
    (should (euler.core/prime? 2)))

  (it "3 is a prime"
    (should (euler.core/prime? 3)))

 (it "4 is not a prime"
   (should-not (euler.core/prime? 4)))

(describe "Max Prime Factor"

  (it "is the max prime factor of 13195"
    (should (= 29 (euler.core/max-prime-factor 13195))))))

(run-specs)
