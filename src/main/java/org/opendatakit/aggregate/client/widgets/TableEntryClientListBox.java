/*
 * Copyright (C) 2013 University of Washington
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.opendatakit.aggregate.client.widgets;

import java.util.List;

import org.opendatakit.aggregate.client.odktables.TableEntryClient;

/**
 * This will just provide a list box of String values. It is modeled after
 * ColumnListBox.
 *
 * NB: not currently used, b/c can't do updates and whatnot.
 *
 * @author sudar.sam@gmail.com
 *
 */
public class TableEntryClientListBox extends AggregateListBox {

	  private final List<TableEntryClient> tables;

	  public TableEntryClientListBox(List<TableEntryClient> tables, boolean multipleValueSelection,
	      boolean onlyIncludeTableName, String tooltipText) {
	    this(tables, multipleValueSelection, onlyIncludeTableName, tooltipText, null);
	  }

	  public TableEntryClientListBox(List<TableEntryClient> tables, boolean multipleValueSelection,
	      boolean onlyIncludeTableName, String tooltipText, String helpBalloonTxt) {
	    super(tooltipText, multipleValueSelection, helpBalloonTxt);
	    this.tables = tables;

	    for (TableEntryClient table : tables) {
	    	// TODO: fix this direction stuff. and figure out wtf it is.
	    	if (onlyIncludeTableName) {
	    		addItem(table.getDisplayName(), "what the hell is direction?");
	    	} else { // display both
	    		addItem(table.getDisplayName() + "--" + table.getTableId(), "direction 2?");
	    	}
	    }
	  }

}
