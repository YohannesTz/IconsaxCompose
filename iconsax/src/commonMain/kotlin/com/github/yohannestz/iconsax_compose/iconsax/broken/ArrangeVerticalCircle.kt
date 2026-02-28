package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrangeVerticalCircle: ImageVector
    get() {
        val current = _arrangeVerticalCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrangeVerticalCircle",
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
                moveTo(x = 10.18f, y = 17.15f)
                lineToRelative(dx = -3.04f, dy = -3.04f)
                moveToRelative(dx = 3.04f, dy = -7.26f)
                verticalLineToRelative(dy = 10.3f)
                moveToRelative(dx = 3.64f, dy = -10.3f)
                lineToRelative(dx = 3.04f, dy = 3.04f)
                moveToRelative(dx = -3.04f, dy = 4.22f)
                verticalLineTo(y = 6.85f)
                moveToRelative(dx = 0.0f, dy = 10.3f)
                verticalLineToRelative(dy = -0.52f)
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
        }.build().also { _arrangeVerticalCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _arrangeVerticalCircle: ImageVector? = null
