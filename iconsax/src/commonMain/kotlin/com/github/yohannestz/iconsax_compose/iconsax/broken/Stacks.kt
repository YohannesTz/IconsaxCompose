package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Stacks: ImageVector
    get() {
        val current = _stacks
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Stacks",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.5f, y = 10.5f)
                horizontalLineToRelative(dx = 9.0f)
                moveTo(x = 9.0f, y = 6.5f)
                lineToRelative(dx = 2.82f, dy = 4.0f)
                moveToRelative(dx = 3.0f, dy = -4.0f)
                lineToRelative(dx = -2.82f, dy = 4.0f)
                moveToRelative(dx = -4.5f, dy = 3.0f)
                horizontalLineToRelative(dx = 9.0f)
                moveToRelative(dx = -7.5f, dy = 4.0f)
                lineToRelative(dx = 2.82f, dy = -4.0f)
                moveToRelative(dx = 3.0f, dy = 4.0f)
                lineToRelative(dx = -2.82f, dy = -4.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.0f, y = 6.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.97f, dy1 = -3.15f)
            }
        }.build().also { _stacks = it }
    }

@Suppress("ObjectPropertyName")
private var _stacks: ImageVector? = null
