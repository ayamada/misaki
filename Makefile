
.PHONY: help

compile:
	lein run vnctst --compile


DEPLOY_DIR := `date +%Y%m%d%H%M%S`

staging: compile
	cp -a vnctst/public ~/htdocs.vnctst.tir.jp/$(DEPLOY_DIR)
	cd ~/htdocs.vnctst.tir.jp && ln -sf $(DEPLOY_DIR) staging

release:
	cd ~/htdocs.vnctst.tir.jp && ln -sf `readlink staging` ja


