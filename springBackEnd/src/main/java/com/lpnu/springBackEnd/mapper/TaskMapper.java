package com.lpnu.springBackEnd.mapper;

import com.lpnu.springBackEnd.dto.TaskDTO;
import com.lpnu.springBackEnd.model.Task;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface TaskMapper {
    TaskDTO toDTO(Task task);
    Task toModel(TaskDTO taskDTO);

}
