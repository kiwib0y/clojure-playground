(ns string-to-number-kata)

;; string to number function
(defn string-to-number [s]
  (if (string? s)
    (Integer/parseInt s)))

(string-to-number "123")
(string-to-number "506")
