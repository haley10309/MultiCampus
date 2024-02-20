import React from 'react';
import {
  MdCheckBoxOutlineBlank,
  MDCheckBox,
  MdRemoveCircleOutline,
  MdCheckBox,
} from 'react-icons/md';

import cn from 'classnames';

const TodoListItem = ({ todo, onRemove ,onToggle}) => {
  const { id, text, checked } = todo; //todo를 받아서 id + text 로 분할!
  return (
    <div className="TodoListItem">
      <div className={cn('checkbox', { checked })} onClick={() => onToggle(id)}>
        {checked ? <MdCheckBox /> : <MdCheckBoxOutlineBlank />}

        <div className="text">{text}</div>
      </div>
      <div className="remove" onClick={() => onRemove(id)}>
        <MdRemoveCircleOutline />
      </div>
    </div>
  );
};

export default TodoListItem;
