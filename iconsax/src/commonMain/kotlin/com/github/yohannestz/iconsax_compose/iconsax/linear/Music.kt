package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Music: ImageVector
    get() {
        val current = _music
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Music",
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
                moveTo(x = 6.28f, y = 22.0f)
                arcToRelative(a = 3.12f, b = 3.12f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.24f)
                arcToRelative(a = 3.12f, b = 3.12f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.24f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.84f, y = 16.8f)
                verticalLineTo(y = 4.6f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.6f, dx2 = -1.63f, dy2 = -2.96f, dx3 = -3.28f, dy3 = -2.51f)
                lineToRelative(dx = -6.24f, dy = 1.7f)
                arcTo(horizontalEllipseRadius = 2.5f, verticalEllipseRadius = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.4f, y1 = 6.3f)
                verticalLineToRelative(dy = 12.57f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.72f, y = 19.92f)
                arcToRelative(a = 3.12f, b = 3.12f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.24f)
                arcToRelative(a = 3.12f, b = 3.12f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.24f)
                moveTo(x = 9.4f, y = 9.52f)
                lineTo(x = 20.84f, y = 6.4f)
            }
        }.build().also { _music = it }
    }

@Suppress("ObjectPropertyName")
private var _music: ImageVector? = null
