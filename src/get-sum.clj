(ns get-sum-inbetween)

(comment "Given two integers a and b, which can be positive
 or negative, find the sum of all the integers between and
 including them and return it. If the two numbers are equal
 return a or b.
 NOTE: a and b are not ordered!")

(defn get-sum [a b]
  (if (<= a b)
    (reduce + (range a (inc b)))
    (reduce + (range b (inc a)))))

(= (get-sum -5 -5) -5)
(= (get-sum -505 4) -127755)
