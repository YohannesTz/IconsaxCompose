package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MonitorRecorder: ImageVector
    get() {
        val current = _monitorRecorder
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MonitorRecorder",
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
                moveTo(x = 2.0f, y = 6.44f)
                curveTo(x1 = 2.0f, y1 = 2.89f, x2 = 2.89f, y2 = 2.0f, x3 = 6.44f, y3 = 2.0f)
                horizontalLineTo(x = 8.0f)
                moveToRelative(dx = 14.0f, dy = 9.89f)
                verticalLineToRelative(dy = 0.89f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.56f, dx2 = -0.89f, dy2 = 4.44f, dx3 = -4.44f, dy3 = 4.44f)
                horizontalLineTo(x = 6.44f)
                curveTo(x1 = 2.89f, y1 = 17.22f, x2 = 2.0f, y2 = 16.33f, x3 = 2.0f, y3 = 12.78f)
                verticalLineToRelative(dy = -1.99f)
                moveToRelative(dx = 10.0f, dy = 6.43f)
                verticalLineTo(y = 22.0f)
                moveTo(x = 2.0f, y = 13.0f)
                horizontalLineToRelative(dx = 20.0f)
                moveTo(x = 7.5f, y = 22.0f)
                horizontalLineToRelative(dx = 9.0f)
                moveToRelative(dx = 1.36f, dy = -12.63f)
                horizontalLineTo(x = 13.1f)
                curveToRelative(dx1 = -1.38f, dy1 = 0.0f, dx2 = -1.84f, dy2 = -0.92f, dx3 = -1.84f, dy3 = -1.84f)
                verticalLineTo(y = 4.01f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = -2.0f)
                horizontalLineToRelative(dx = 4.6f)
                arcToRelative(a = 1.84f, b = 1.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.84f, dy1 = 1.84f)
                verticalLineToRelative(dy = 3.68f)
                arcToRelative(a = 1.84f, b = 1.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.84f, dy1 = 1.84f)
                moveToRelative(dx = 3.05f, dy = -1.45f)
                lineTo(x = 19.7f, y = 7.07f)
                verticalLineTo(y = 4.3f)
                lineToRelative(dx = 1.21f, dy = -0.85f)
                curveTo(x1 = 21.51f, y1 = 3.05f, x2 = 22.0f, y2 = 3.3f, x3 = 22.0f, y3 = 4.03f)
                verticalLineToRelative(dy = 3.33f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.73f, dx2 = -0.49f, dy2 = 0.98f, dx3 = -1.09f, dy3 = 0.56f)
            }
        }.build().also { _monitorRecorder = it }
    }

@Suppress("ObjectPropertyName")
private var _monitorRecorder: ImageVector? = null
