package com.github.dockerjava.core.command;

import java.util.List;

import com.github.dockerjava.api.command.SearchImagesCmd;
import com.github.dockerjava.api.model.SearchItem;

import com.google.common.base.Preconditions;

/**
 * Search images
 *
 * @param term - search term
 *
 */
public class SearchImagesCmdImpl extends AbstrDockerCmd<SearchImagesCmd, List<SearchItem>> implements SearchImagesCmd  {

	private String term;

	public SearchImagesCmdImpl(SearchImagesCmd.Exec exec, String term) {
		super(exec);
		withTerm(term);
	}

    @Override
	public String getTerm() {
        return term;
    }

    @Override
	public SearchImagesCmd withTerm(String term) {
		Preconditions.checkNotNull(term, "term was not specified");
		this.term = term;
		return this;
	}

    @Override
    public String toString() {
        return new StringBuilder("search ")
            .append(term)
            .toString();
    }
}
