package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Video: ImageVector
    get() {
        val current = _video
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Video",
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
                moveTo(x = 2.0f, y = 7.79f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.16f, dx2 = 1.05f, dy2 = -4.21f, dx3 = 4.21f, dy3 = -4.21f)
                horizontalLineToRelative(dx = 6.32f)
                curveToRelative(dx1 = 3.16f, dy1 = 0.0f, dx2 = 4.21f, dy2 = 1.05f, dx3 = 4.21f, dy3 = 4.2f)
                verticalLineToRelative(dy = 8.43f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.16f, dx2 = -1.05f, dy2 = 4.2f, dx3 = -4.21f, dy3 = 4.2f)
                horizontalLineTo(x = 6.21f)
                curveToRelative(dx1 = -3.16f, dy1 = 0.0f, dx2 = -4.21f, dy2 = -2.1f, dx3 = -4.21f, dy3 = -4.2f)
                verticalLineToRelative(dy = -4.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.52f, y = 17.1f)
                lineToRelative(dx = -2.78f, dy = -1.95f)
                verticalLineTo(y = 8.84f)
                lineToRelative(dx = 2.78f, dy = -1.95f)
                curveTo(x1 = 20.88f, y1 = 5.94f, x2 = 22.0f, y2 = 6.52f, x3 = 22.0f, y3 = 8.19f)
                verticalLineToRelative(dy = 7.62f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.67f, dx2 = -1.12f, dy2 = 2.25f, dx3 = -2.48f, dy3 = 1.29f)
                moveTo(x = 13.0f, y = 9.5f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -1.5f, dy1 = 1.5f)
            }
        }.build().also { _video = it }
    }

@Suppress("ObjectPropertyName")
private var _video: ImageVector? = null
