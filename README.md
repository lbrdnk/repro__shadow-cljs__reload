# What is this?

Repository containing code used to clarify [shadow-cljs](https://github.com/thheller/shadow-cljs) use cases where `:reload-strategy` `:full` must be used for _hot code reload_ to work properly, ie. for changes to take effect on reload.

# Running the examples

- To set `:reload-strategy` to `:full` modify `./shadow-cljs.edn`. If not set, _hot code reload_ for following cases won't work.
- It is also assumed that _fast refresh_ is shutdown. (On mac use `Ctrl-Cmd-z` to get into dev menu and disable it from there.)

To run examples do following from repository root:

1. `yarn install`
2. `yarn babel:watch`
3. run watch, eg. `./node_modules/.bin/shadow-cljs watch <build-id>`
4. run expo and simulator, eg. `yarn ios`
5. To test the functionality continue according to instructions for particular build.


# `:nested-repro` build

This build shows, that without use of `:reload-strategy :full` changing component `com.lbrdnk.shadow-reload-repro.components.third-comp/third-comp` and saving file, won't propagate the change into running app. Just try chaning text in the component's body.


# `:default-repro` build

Here modification of js component, which is exported as default and requiring it as advised in [docs](https://shadow-cljs.github.io/docs/UsersGuide.html#_using_npm_packages), specifically _Example Default Export_ section, won't take effect during _hot code reload_. Try to modify text in `src/js/com/lbrdnk/shadow_reload_repro/components/SomeComponent.jsx`. On the other hand, hot reload for `src/js/com/lbrdnk/shadow_reload_repro/components/AnotherComponent.jsx`, which _is not exported default_, hot reload works properly.


# Finally

Common denominator for both cases is that all modules that are using modified code, even transitively, must be reloaded for change to propagate in running app. Problem occurs with expo, but I assume it is case of react native in general.
