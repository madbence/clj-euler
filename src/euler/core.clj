(ns euler.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [ns-name (format "euler.p%03d" (Integer/parseInt (first args)))]
    (println ns-name)
    (require (symbol ns-name))
    (let [p-ns (find-ns (symbol ns-name))
          solve (ns-resolve p-ns 'solve)]
      (println (solve)))))
