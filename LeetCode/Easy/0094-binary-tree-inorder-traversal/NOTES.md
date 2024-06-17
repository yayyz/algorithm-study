<pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-formatting cm-formatting-header cm-formatting-header-2 cm-header cm-header-2">## </span><span class="cm-header cm-header-2">Inorder Traversal </span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-formatting cm-formatting-list cm-formatting-list-ul cm-variable-2">- </span><span class="cm-variable-2">node visit order: Left -&gt; Root -&gt; Right </span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span cm-text="">​</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-formatting cm-formatting-header cm-formatting-header-3 cm-header cm-header-3">### </span><span class="cm-header cm-header-3">algorithm: </span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-formatting cm-formatting-list cm-formatting-list-ul cm-variable-2">- </span><span class="cm-variable-2">traverse the left subtree (LEFT)</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-formatting cm-formatting-list cm-formatting-list-ul cm-variable-2">- </span><span class="cm-variable-2">visit the root (root of the subtree? (ROOT)</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-formatting cm-formatting-list cm-formatting-list-ul cm-variable-2">- </span><span class="cm-variable-2">traverse the right subtree (RIGHT) </span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span cm-text="">​</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-formatting cm-formatting-code-block cm-comment">```java</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-comment">void inorder(Node node) {</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-tab" role="presentation" cm-text="	">  </span><span class="cm-comment">if (node == null) </span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp;  <span class="cm-tab" role="presentation" cm-text="	">  </span><span class="cm-comment">return;</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-comment">// LEFT; traverse to the leaf node &nbsp; &nbsp;</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-comment">inorder(node.left);</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;</span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-comment">System.out.println("["+ node.key + "]");</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;</span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-comment">// RIGHT</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"> &nbsp; &nbsp;<span class="cm-comment">inorder(node.right);</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-comment">}</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-formatting cm-formatting-code-block cm-comment">```</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span cm-text="">​</span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-formatting cm-formatting-header cm-formatting-header-3 cm-header cm-header-3">### </span><span class="cm-header cm-header-3">Time complextiy </span></span></pre><pre class=" CodeMirror-line " role="presentation"><span role="presentation" style="padding-right: 0.1px;"><span class="cm-formatting cm-formatting-list cm-formatting-list-ul cm-variable-2">- </span><span class="cm-variable-2">O(N)</span></span></pre>