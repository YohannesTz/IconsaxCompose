package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VideoPlay: ImageVector
    get() {
        val current = _videoPlay
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.VideoPlay",
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
                moveTo(x = 22.0f, y = 15.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                moveTo(x = 2.52f, y = 7.11f)
                horizontalLineToRelative(dx = 18.96f)
                moveToRelative(dx = -12.96f, dy = -5.0f)
                verticalLineToRelative(dy = 4.86f)
                moveToRelative(dx = 6.96f, dy = -4.86f)
                verticalLineToRelative(dy = 4.41f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.75f, y = 14.45f)
                verticalLineToRelative(dy = -1.2f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.54f, dx2 = 1.09f, dy2 = -2.17f, dx3 = 2.42f, dy3 = -1.4f)
                lineToRelative(dx = 1.04f, dy = 0.6f)
                lineToRelative(dx = 1.04f, dy = 0.6f)
                curveToRelative(dx1 = 1.33f, dy1 = 0.77f, dx2 = 1.33f, dy2 = 2.03f, dx3 = 0.0f, dy3 = 2.8f)
                lineToRelative(dx = -1.04f, dy = 0.6f)
                lineToRelative(dx = -1.04f, dy = 0.6f)
                curveToRelative(dx1 = -1.33f, dy1 = 0.77f, dx2 = -2.42f, dy2 = 0.14f, dx3 = -2.42f, dy3 = -1.4f)
                close()
            }
        }.build().also { _videoPlay = it }
    }

@Suppress("ObjectPropertyName")
private var _videoPlay: ImageVector? = null
