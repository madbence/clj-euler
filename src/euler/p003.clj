(ns euler.p003)

(defn factors [n]
  (loop [n n
         m 2
         l []]
    (cond
      (= n 1) l
      (zero? (mod n m)) (recur (quot n m) m (conj l m))
      true (recur n (inc m) l))))

(defn solve []
  (->> (factors 600851475143)
       (reduce max)))
