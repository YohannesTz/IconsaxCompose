package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Convert: ImageVector
    get() {
        val current = _convert
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Convert",
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
                moveTo(x = 12.0f, y = 21.98f)
                arcToRelative(a = 9.98f, b = 9.98f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -19.96f)
                arcTo(horizontalEllipseRadius = 9.98f, verticalEllipseRadius = 9.98f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 22.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.14f, y = 4.02f)
                lineToRelative(dx = 8.16f, dy = 8.19f)
                lineToRelative(dx = 0.02f, dy = -4.55f)
                moveToRelative(dx = 3.54f, dy = 12.32f)
                lineTo(x = 9.7f, y = 11.8f)
                lineToRelative(dx = -0.02f, dy = 4.54f)
            }
        }.build().also { _convert = it }
    }

@Suppress("ObjectPropertyName")
private var _convert: ImageVector? = null
