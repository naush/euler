(ns euler.core)

; Problem 2

(defn nth-fib [n] (if (< n 2) 1 (+ (nth-fib (- n 1)) (nth-fib (- n 2)))))

(defn sum-even-fib-upto [max acc cur]
  (let [n (nth-fib cur)]
  (if (< n max)
    (sum-even-fib-upto max (if (even? n) (+ acc n) acc) (inc cur))
    acc)))

; Problem 3

(defn factor? [a b] (= 0 (rem a b)))
(defn less-factors [n] (filter #(factor? n %1) (range 2 (inc (Math/sqrt n)))))
(defn big-integer? [n] (= n (bigint n)))
(defn prime? [n] (if (<= n 2) true (empty? (less-factors n))))
(defn prime-factor? [a b] (and (big-integer? b) (factor? a b) (prime? b)))
(defn max-prime-factor [n]
  (let [counter 1]
    (loop [counter (inc counter)]
      (let [candidate (/ n counter)]
      (if (prime-factor? n candidate) candidate (recur (inc counter)))))))
