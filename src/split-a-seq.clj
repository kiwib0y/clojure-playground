(ns split-a-seq)

(comment "Split a sequence")
(comment "Write a function which will
split a sequence into two parts.")

(defn solution
  [x coll]
  (into [] (map vec (split-at x coll))))

(solution 1 [:a :b :c :d])
(solution 3 [1 2 3 4 5 6])
(solution 2 [[1 2] [3 4] [5 6]])
