(ns euler.p001)

(defn solve []
  (->> (range 0 1000)
       (filter #(or (zero? (mod % 3)) (zero? (mod % 5))))
       (reduce +)))
