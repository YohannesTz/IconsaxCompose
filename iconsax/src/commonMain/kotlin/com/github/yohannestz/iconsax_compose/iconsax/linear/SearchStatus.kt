package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SearchStatus: ImageVector
    get() {
        val current = _searchStatus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SearchStatus",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.0f, y = 5.0f)
                horizontalLineToRelative(dx = 6.0f)
                moveToRelative(dx = -6.0f, dy = 3.0f)
                horizontalLineToRelative(dx = 3.0f)
                moveToRelative(dx = 4.0f, dy = 3.5f)
                arcTo(horizontalEllipseRadius = 9.5f, verticalEllipseRadius = 9.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 11.5f, y1 = 2.0f)
                moveTo(x = 22.0f, y = 22.0f)
                lineToRelative(dx = -2.0f, dy = -2.0f)
            }
        }.build().also { _searchStatus = it }
    }

@Suppress("ObjectPropertyName")
private var _searchStatus: ImageVector? = null
