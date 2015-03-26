; Clojure Unity REPL
; Clojure 1.7.0-master-SNAPSHOT
; Unity 4.6.0f3 (30840d631a27)
; Mono 2.6.5 (tarball)


user=> :d
:d

user=> (+ 1 1)
2

user=> nil

caroline-lessons.program-1=> nil

caroline-lessons.program-1=> System.InvalidOperationException: Unable to resolve symbol: cube-spec in this context
  at clojure.lang.Compiler.ResolveIn (clojure.lang.Namespace n, clojure.lang.Symbol symbol, Boolean allowPrivate) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Resolve (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.AnalyzeSymbol (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Analyze (clojure.lang.CljCompiler.Ast.ParserContext pcontext, System.Object form, System.String name) [0x00000] in <filename unknown>:0 , compiling: (NO_SOURCE_PATH:0:0)
caroline-lessons.program-1=> (in-ns 'caroline-lessons.program-1)
#<Namespace caroline-lessons.program-1>

caroline-lessons.program-1=> cube-assault
#<Unbound Unbound: #'caroline-lessons.program-1/cube-assault>

caroline-lessons.program-1=> (require 'caroline-lessons.program-1)
nil

caroline-lessons.program-1=> cube-assault
#<Unbound Unbound: #'caroline-lessons.program-1/cube-assault>

caroline-lessons.program-1=> nil

caroline-lessons.program-1=> #'caroline-lessons.program-1/kill!

caroline-lessons.program-1=> #'caroline-lessons.program-1/cube-spec

caroline-lessons.program-1=> #'caroline-lessons.program-1/cube-assault

caroline-lessons.program-1=> cube-assault
#<caroline_lessons/program_1$cube_assault__17528 caroline_lessons/program_1$cube_assault__17528>

caroline-lessons.program-1=> (cube-assault 1)
nil

caroline-lessons.program-1=> (cube-assault 1)
nil

caroline-lessons.program-1=> :d
:d

user=> :d
:d

user=> (require 'caroline-lessons.program-1)
System.IO.FileNotFoundException: Could not locate caroline_lessons.program_1.clj.dll or caroline_lessons/program_1.clj on load path.
  at clojure.lang.RT.load (System.String relativePath, Boolean failIfNotFound) [0x00000] in <filename unknown>:0 
  at clojure.lang.RT.load (System.String relativePath) [0x00000] in <filename unknown>:0 
  at clojure/core$load$fn__5855__5859.invoke () [0x00000] in <filename unknown>:0 
  at clojure/core$load__5862.doInvoke (System.Object ) [0x00000] in <filename unknown>:0 
  at clojure.lang.RestFn.invoke (System.Object arg1) [0x00000] in <filename unknown>:0 
  at clojure/core$load_one__5735.invoke (System.Object , System.Object , System.Object ) [0x00000] in <filename unknown>:0 
  at clojure/core$load_lib$fn__5773__5777.invoke () [0x00000] in <filename unknown>:0 
user=> (require 'caroline-lessons.program-1)
System.IO.FileNotFoundException: Could not locate caroline_lessons.program_1.clj.dll or caroline_lessons/program_1.clj on load path.
  at clojure.lang.RT.load (System.String relativePath, Boolean failIfNotFound) [0x00000] in <filename unknown>:0 
  at clojure.lang.RT.load (System.String relativePath) [0x00000] in <filename unknown>:0 
  at clojure/core$load$fn__5855__5859.invoke () [0x00000] in <filename unknown>:0 
  at clojure/core$load__5862.doInvoke (System.Object ) [0x00000] in <filename unknown>:0 
  at clojure.lang.RestFn.invoke (System.Object arg1) [0x00000] in <filename unknown>:0 
  at clojure/core$load_one__5735.invoke (System.Object , System.Object , System.Object ) [0x00000] in <filename unknown>:0 
  at clojure/core$load_lib$fn__5773__5777.invoke () [0x00000] in <filename unknown>:0 
user=> :d
:d

user=> :d
:d

user=> (require 'caroline-lessons.program-1)
nil

user=> cube-assault
System.InvalidOperationException: Unable to resolve symbol: cube-assault in this context
  at clojure.lang.Compiler.ResolveIn (clojure.lang.Namespace n, clojure.lang.Symbol symbol, Boolean allowPrivate) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Resolve (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.AnalyzeSymbol (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Analyze (clojure.lang.CljCompiler.Ast.ParserContext pcontext, System.Object form, System.String name) [0x00000] in <filename unknown>:0 , compiling: (NO_SOURCE_PATH:0:0)
user=> (in-ns 'caroline-lessons.program-1')
#<Namespace caroline-lessons.program-1'>

caroline-lessons.program-1'=> (in-ns 'caroline-lessons.program-1)
System.InvalidOperationException: Unable to resolve symbol: use in this context
  at clojure.lang.Compiler.ResolveIn (clojure.lang.Namespace n, clojure.lang.Symbol symbol, Boolean allowPrivate) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Resolve (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.AnalyzeSymbol (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Analyze (clojure.lang.CljCompiler.Ast.ParserContext pcontext, System.Object form, System.String name) [0x00000] in <filename unknown>:0 , compiling: (NO_SOURCE_PATH:0:0)
caroline-lessons.program-1'=> (in-ns 'user)
System.InvalidOperationException: Unable to resolve symbol: use in this context
  at clojure.lang.Compiler.ResolveIn (clojure.lang.Namespace n, clojure.lang.Symbol symbol, Boolean allowPrivate) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Resolve (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.AnalyzeSymbol (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Analyze (clojure.lang.CljCompiler.Ast.ParserContext pcontext, System.Object form, System.String name) [0x00000] in <filename unknown>:0 , compiling: (NO_SOURCE_PATH:0:0)
caroline-lessons.program-1'=> (use 'user)
System.InvalidOperationException: Unable to resolve symbol: use in this context
  at clojure.lang.Compiler.ResolveIn (clojure.lang.Namespace n, clojure.lang.Symbol symbol, Boolean allowPrivate) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Resolve (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.AnalyzeSymbol (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Analyze (clojure.lang.CljCompiler.Ast.ParserContext pcontext, System.Object form, System.String name) [0x00000] in <filename unknown>:0 , compiling: (NO_SOURCE_PATH:0:0)
caroline-lessons.program-1'=> :d
:d

user=> nil

caroline-lessons.program-1=> cube-spec
System.InvalidOperationException: Unable to resolve symbol: cube-spec in this context
  at clojure.lang.Compiler.ResolveIn (clojure.lang.Namespace n, clojure.lang.Symbol symbol, Boolean allowPrivate) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Resolve (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.AnalyzeSymbol (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Analyze (clojure.lang.CljCompiler.Ast.ParserContext pcontext, System.Object form, System.String name) [0x00000] in <filename unknown>:0 , compiling: (NO_SOURCE_PATH:0:0)
caroline-lessons.program-1=> (require 'caroline-lessons.program-1)
nil

caroline-lessons.program-1=> cube-spec
System.InvalidOperationException: Unable to resolve symbol: cube-spec in this context
  at clojure.lang.Compiler.ResolveIn (clojure.lang.Namespace n, clojure.lang.Symbol symbol, Boolean allowPrivate) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Resolve (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.AnalyzeSymbol (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Analyze (clojure.lang.CljCompiler.Ast.ParserContext pcontext, System.Object form, System.String name) [0x00000] in <filename unknown>:0 , compiling: (NO_SOURCE_PATH:0:0)
caroline-lessons.program-1=> #'caroline-lessons.program-1/kill!

caroline-lessons.program-1=> #'caroline-lessons.program-1/cube-spec

caroline-lessons.program-1=> #'caroline-lessons.program-1/cube-assault

caroline-lessons.program-1=> cube-spec
{:children [], :transform [{:arcadia.hydrate/type UnityEngine.Transform, :local-position (0.0, 0.0, 0.0), :local-scale (1.0, 1.0, 1.0), :local-rotation (0.0, 0.0, 0.0, 1.0)}], :is-static false, :name "Cube", :box-collider [{:arcadia.hydrate/type UnityEngine.BoxCollider, :enabled true, :extents (0.5, 0.5, 0.5), :size (1.0, 1.0, 1.0), :center (0.0, 0.0, 0.0), :is-trigger nil, :shared-material nil}], :layer 0, :mesh-filter [{:arcadia.hydrate/type UnityEngine.MeshFilter, :shared-mesh #<Mesh Cube (UnityEngine.Mesh)>}], :active true, :mesh-renderer [{:use-light-probes nil, :shared-materials [#<Material Default-Diffuse (UnityEngine.Material)>], :receive-shadows true, :shared-material #<Material Default-Diffuse (UnityEngine.Material)>, :light-probe-anchor nil, :sorting-order 0, :lightmap-index -1, :arcadia.hydrate/type UnityEngine.MeshRenderer, :lightmap-tiling-offset (1.0, 1.0, 0.0, 0.0), :enabled true, :cast-shadows true, :sorting-layer-id 0, :sorting-layer-name ""}], :hide-flags None, :tag "Untagged", :arcadia.hydrate/type UnityEngine.GameObject}

caroline-lessons.program-1=> (pprint cube-spec)
{:children [],
 :transform
 [{:arcadia.hydrate/type UnityEngine.Transform,
   :local-position (0.0, 0.0, 0.0),
   :local-scale (1.0, 1.0, 1.0),
   :local-rotation (0.0, 0.0, 0.0, 1.0)}],
 :is-static false,
 :name "Cube",
 :box-collider
 [{:arcadia.hydrate/type UnityEngine.BoxCollider,
   :enabled true,
   :extents (0.5, 0.5, 0.5),
   :size (1.0, 1.0, 1.0),
   :center (0.0, 0.0, 0.0),
   :is-trigger nil,
   :shared-material nil}],
 :layer 0,
 :mesh-filter
 [{:arcadia.hydrate/type UnityEngine.MeshFilter,
   :shared-mesh #<Mesh Cube (UnityEngine.Mesh)>}],
 :active true,
 :mesh-renderer
 [{:use-light-probes nil,
   :shared-materials
   [#<Material Default-Diffuse (UnityEngine.Material)>],
   :receive-shadows true,
   :shared-material #<Material Default-Diffuse (UnityEngine.Material)>,
   :light-probe-anchor nil,
   :sorting-order 0,
   :lightmap-index -1,
   :arcadia.hydrate/type UnityEngine.MeshRenderer,
   :lightmap-tiling-offset (1.0, 1.0, 0.0, 0.0),
   :enabled true,
   :cast-shadows true,
   :sorting-layer-id 0,
   :sorting-layer-name ""}],
 :hide-flags None,
 :tag "Untagged",
 :arcadia.hydrate/type UnityEngine.GameObject}
nil

caroline-lessons.program-1=> (cube-assault 1)
nil

caroline-lessons.program-1=> (cube-assault 7.5)
nil

caroline-lessons.program-1=> (cube-assault 7.5)
nil

caroline-lessons.program-1=> (cube-assault 11.2)
nil

caroline-lessons.program-1=> (cube-assault 1120)
nil

caroline-lessons.program-1=> #'caroline-lessons.program-1/cube-assault

caroline-lessons.program-1=> (cube-assault 13)
System.InvalidOperationException: Unable to resolve symbol: cube-assault in this context
  at clojure.lang.Compiler.ResolveIn (clojure.lang.Namespace n, clojure.lang.Symbol symbol, Boolean allowPrivate) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Resolve (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.AnalyzeSymbol (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Analyze (clojure.lang.CljCompiler.Ast.ParserContext pcontext, System.Object form, System.String name) [0x00000] in <filename unknown>:0 , compiling: (NO_SOURCE_PATH:0:0)
user=> nil

caroline-lessons.program-1=> cube-assault
System.InvalidOperationException: Unable to resolve symbol: cube-assault in this context
  at clojure.lang.Compiler.ResolveIn (clojure.lang.Namespace n, clojure.lang.Symbol symbol, Boolean allowPrivate) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Resolve (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.AnalyzeSymbol (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Analyze (clojure.lang.CljCompiler.Ast.ParserContext pcontext, System.Object form, System.String name) [0x00000] in <filename unknown>:0 , compiling: (NO_SOURCE_PATH:0:0)
caroline-lessons.program-1=> nil

caroline-lessons.program-1=> 
caroline-lessons.program-1=> #'caroline-lessons.program-1/kill!

caroline-lessons.program-1=> 
caroline-lessons.program-1=> #'caroline-lessons.program-1/cube-spec

caroline-lessons.program-1=> 
caroline-lessons.program-1=> #'caroline-lessons.program-1/cube-assault

caroline-lessons.program-1=> 
caroline-lessons.program-1=> cube-assault
#<caroline_lessons/program_1$cube_assault__132 caroline_lessons/program_1$cube_assault__132>

caroline-lessons.program-1=> (cube-assault 11)
nil

caroline-lessons.program-1=> (cube-assault 11)
nil

caroline-lessons.program-1=> #'caroline-lessons.program-1/cube-assault

caroline-lessons.program-1=> (cube-assault 11)
nil

caroline-lessons.program-1=> (when false)
nil

caroline-lessons.program-1=> (when :d)
nil

caroline-lessons.program-1=> (when :d 5)
5

caroline-lessons.program-1=> (when false 5)
nil

caroline-lessons.program-1=> (pprint(deep-merge-mv
            cube-spec
            {:transform [{:local-position [i i 0]}]}))
System.InvalidOperationException: Unable to resolve symbol: i in this context
  at clojure.lang.Compiler.ResolveIn (clojure.lang.Namespace n, clojure.lang.Symbol symbol, Boolean allowPrivate) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Resolve (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.AnalyzeSymbol (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Analyze (clojure.lang.CljCompiler.Ast.ParserContext pcontext, System.Object form, System.String name) [0x00000] in <filename unknown>:0 , compiling: (NO_SOURCE_PATH:0:0)
caroline-lessons.program-1=> (pprint(deep-merge-mv
            cube-spec
            {:transform [{:local-position [5 5 0]}]}))
{:children [],
 :transform
 [{:arcadia.hydrate/type UnityEngine.Transform,
   :local-position [5 5 0],
   :local-scale (1.0, 1.0, 1.0),
   :local-rotation (0.0, 0.0, 0.0, 1.0)}],
 :is-static false,
 :name "Cube",
 :box-collider
 [{:arcadia.hydrate/type UnityEngine.BoxCollider,
   :enabled true,
   :extents (0.5, 0.5, 0.5),
   :size (1.0, 1.0, 1.0),
   :center (0.0, 0.0, 0.0),
   :is-trigger nil,
   :shared-material nil}],
 :layer 0,
 :mesh-filter
 [{:arcadia.hydrate/type UnityEngine.MeshFilter,
   :shared-mesh #<Mesh Cube (UnityEngine.Mesh)>}],
 :active true,
 :mesh-renderer
 [{:use-light-probes nil,
   :shared-materials
   [#<Material Default-Diffuse (UnityEngine.Material)>],
   :receive-shadows true,
   :shared-material #<Material Default-Diffuse (UnityEngine.Material)>,
   :light-probe-anchor nil,
   :sorting-order 0,
   :lightmap-index -1,
   :arcadia.hydrate/type UnityEngine.MeshRenderer,
   :lightmap-tiling-offset (1.0, 1.0, 0.0, 0.0),
   :enabled true,
   :cast-shadows true,
   :sorting-layer-id 0,
   :sorting-layer-name ""}],
 :hide-flags None,
 :tag "Untagged",
 :arcadia.hydrate/type UnityEngine.GameObject}
nil

caroline-lessons.program-1=> (inc 0)
1

caroline-lessons.program-1=> (source inc)
(defn inc
  "Returns a number one greater than num. Does not auto-promote
  longs, will throw on overflow. See also: inc'"
  {:inline (fn [x] `(. clojure.lang.Numbers (~(if *unchecked-math* 'unchecked_inc 'inc) ~x)))
   :added "1.2"}
  [x] (. clojure.lang.Numbers (inc x)))
nil

caroline-lessons.program-1=> (map inc [0 1 2 3])
(1 2 3 4)

caroline-lessons.program-1=> (range 10)
(0 1 2 3 4 5 6 7 8 9)

caroline-lessons.program-1=> (mapv inc (range 10))
[1 2 3 4 5 6 7 8 9 10]

caroline-lessons.program-1=> #'caroline-lessons.program-1/cube-assault-2

caroline-lessons.program-1=> (cube-assault-2 4)
#<GameObject cubes (UnityEngine.GameObject)>

caroline-lessons.program-1=> System.InvalidOperationException: Unable to resolve symbol: d in this context
  at clojure.lang.Compiler.ResolveIn (clojure.lang.Namespace n, clojure.lang.Symbol symbol, Boolean allowPrivate) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Resolve (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.AnalyzeSymbol (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Analyze (clojure.lang.CljCompiler.Ast.ParserContext pcontext, System.Object form, System.String name) [0x00000] in <filename unknown>:0 , compiling: (NO_SOURCE_PATH:0:0)
caroline-lessons.program-1=> #'caroline-lessons.program-1/cube-assault-2

caroline-lessons.program-1=> (cube-assault-2 4)
#<GameObject cubes (UnityEngine.GameObject)>

caroline-lessons.program-1=> #'caroline-lessons.program-1/cube-assault-2

caroline-lessons.program-1=> (cube-assault-2 4)
#<GameObject cubes (UnityEngine.GameObject)>

caroline-lessons.program-1=> (rand)
0.232634952400175

caroline-lessons.program-1=> #'caroline-lessons.program-1/cube-assault-2

caroline-lessons.program-1=> (cube-assault-2 4)
#<GameObject cubes (UnityEngine.GameObject)>

caroline-lessons.program-1=> (cube-assault-2 4)
#<GameObject cubes (UnityEngine.GameObject)>

caroline-lessons.program-1=> (cube-assault-2 400)
#<GameObject cubes (UnityEngine.GameObject)>

caroline-lessons.program-1=> (take 5 (range 10))
(0 1 2 3 4)

user=> (take 5 (range))
(0 1 2 3 4)

user=> (0 [:hi-there 0] [:hi-there [:hi-there 0]] [:hi-there [:hi-there [:hi-there 0]]] [:hi-there [:hi-there [:hi-there [:hi-there 0]]]])

user=> System.InvalidOperationException: Unable to resolve symbol: pprint in this context
  at clojure.lang.Compiler.ResolveIn (clojure.lang.Namespace n, clojure.lang.Symbol symbol, Boolean allowPrivate) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Resolve (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.AnalyzeSymbol (clojure.lang.Symbol symbol) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.Analyze (clojure.lang.CljCompiler.Ast.ParserContext pcontext, System.Object form, System.String name) [0x00000] in <filename unknown>:0 , compiling: (NO_SOURCE_PATH:0:0)
user=> nil

caroline-lessons.program-1=> nil

caroline-lessons.program-1=> 
caroline-lessons.program-1=> #'caroline-lessons.program-1/kill!

caroline-lessons.program-1=> 
caroline-lessons.program-1=> #'caroline-lessons.program-1/cube-spec

caroline-lessons.program-1=> 
caroline-lessons.program-1=> #'caroline-lessons.program-1/cube-assault

caroline-lessons.program-1=> 
caroline-lessons.program-1=> 
caroline-lessons.program-1=> #'caroline-lessons.program-1/cube-assault-2

caroline-lessons.program-1=> 
caroline-lessons.program-1=> 
caroline-lessons.program-1=> (0
 [:hi-there 0]
 [:hi-there [:hi-there 0]]
 [:hi-there [:hi-there [:hi-there 0]]]
 [:hi-there [:hi-there [:hi-there [:hi-there 0]]]])
nil

caroline-lessons.program-1=> *print-level*
nil

caroline-lessons.program-1=> 100

caroline-lessons.program-1=> 14

caroline-lessons.program-1=> (range)
(0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 ...)

caroline-lessons.program-1=> (take 4())
()

caroline-lessons.program-1=> System.InvalidCastException: Cannot cast from source type to destination type.
  at System.Convert.ToInt64 (System.Object value, IFormatProvider provider) [0x00009] in /Users/builduser/buildslave/mono-runtime-and-classlibs/build/mcs/class/corlib/System/Convert.cs:1452 
  at clojure.lang.Util.ConvertToLong (System.Object o) [0x00000] in <filename unknown>:0 
  at clojure.lang.Numbers+LongOps.add (System.Object x, System.Object y) [0x00000] in <filename unknown>:0 
  at clojure.lang.Numbers.add (System.Object x, System.Object y) [0x00000] in <filename unknown>:0 
  at clojure.lang.Numbers.add (Int64 x, System.Object y) [0x00000] in <filename unknown>:0 
  at caroline_lessons/program_1$eval__294__306.invoke () [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.eval (System.Object form) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.eval (System.Object form) [0x00000] in <filename unknown>:0 
  at clojure/core$eval__51310.invoke (System.Object ) [0x00000] in core.clj:3076 
  at arcadia/repl$repl_eval_print$fn__26443__26447.invoke () [0x001e3] in repl.clj:59 
  at arcadia/repl$repl_eval_print__26450.invoke (System.Object , System.Object ) [0x0041e] in repl.clj:57 
  at arcadia/repl$repl_eval_string__26466.invoke (System.Object , System.Object ) [0x0002f] in repl.clj:75 
  at arcadia/repl$repl_eval_string__26466.invoke (System.Object ) [0x00000] in repl.clj:72 
  at arcadia/repl$eval_queue$fn__26474__26478.invoke () [0x00000] in repl.clj:84 
caroline-lessons.program-1=> (doc iterate)
-------------------------
clojure.core/iterate
([f x])
  Returns a lazy sequence of x, (f x), (f (f x)) etc. f must be free of side-effects
nil

caroline-lessons.program-1=> (0 1 2 3)

caroline-lessons.program-1=> System.ArgumentException: First argument to defn must be a symbol
  at clojure/core$defn__48909.doInvoke (System.Object , System.Object , System.Object , System.Object ) [0x00015] in core.clj:281 
  at clojure.lang.RestFn.invoke (System.Object arg1, System.Object arg2, System.Object arg3, System.Object arg4) [0x00000] in <filename unknown>:0 
  at clojure.lang.Var.invoke (System.Object arg1, System.Object arg2, System.Object arg3, System.Object arg4) [0x00000] in <filename unknown>:0 
  at clojure.lang.AFn.ApplyToHelper (IFn fn, ISeq argList) [0x00000] in <filename unknown>:0 
  at clojure.lang.Var.applyTo (ISeq arglist) [0x00000] in <filename unknown>:0 
  at clojure.lang.Compiler.MacroexpandSeq1 (ISeq form) [0x00000] in <filename unknown>:0 , compiling: (NO_SOURCE_PATH:0:0)
caroline-lessons.program-1=> #'caroline-lessons.program-1/i-dont-know

caroline-lessons.program-1=> (i-dont-know 5)
(0 1 2 3 4)

caroline-lessons.program-1=> 