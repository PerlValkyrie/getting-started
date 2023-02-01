(ns getting-started.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(+ 1 1)

(defn hello [] 
"Hello World")

(hello)

(defn can-drink? [age]
  (if (> age 18) "Beer" "Coke"))

(can-drink? 19)


(+ 2 3)

(* (+ 1 1) 3)

(ns kata)
(defn greet [name_ owner]
  (if (= name_ owner) "Hello boss" "Hello guest")
)