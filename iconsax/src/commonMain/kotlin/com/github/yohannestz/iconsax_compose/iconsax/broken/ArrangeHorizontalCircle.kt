package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrangeHorizontalCircle: ImageVector
    get() {
        val current = _arrangeHorizontalCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrangeHorizontalCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.15f, y = 13.82f)
                lineToRelative(dx = -3.04f, dy = 3.04f)
                moveToRelative(dx = -7.26f, dy = -3.04f)
                horizontalLineToRelative(dx = 10.3f)
                moveToRelative(dx = -10.3f, dy = -3.64f)
                lineToRelative(dx = 3.04f, dy = -3.04f)
                moveToRelative(dx = 4.22f, dy = 3.04f)
                horizontalLineTo(x = 6.85f)
                moveToRelative(dx = 10.3f, dy = 0.0f)
                horizontalLineToRelative(dx = -0.52f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.0f, y = 6.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 3.97f, dy1 = -3.15f)
            }
        }.build().also { _arrangeHorizontalCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _arrangeHorizontalCircle: ImageVector? = null
