(ns euler.p002)

(defn fib
  ([] (fib 0 1))
  ([a b] (lazy-seq (cons a (fib b (+ a b))))))

(defn solve []
  (->> (take-while #(< % 4000000) (fib))
       (filter even?)
       (reduce +)))
