package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectInbox: ImageVector
    get() {
        val current = _directInbox
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DirectInbox",
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
                moveTo(x = 12.0f, y = 2.0f)
                verticalLineToRelative(dy = 7.0f)
                lineToRelative(dx = 2.0f, dy = -2.0f)
                moveToRelative(dx = -2.0f, dy = 2.0f)
                lineToRelative(dx = -2.0f, dy = -2.0f)
                moveToRelative(dx = -8.02f, dy = 6.0f)
                horizontalLineToRelative(dx = 4.41f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.89f, dy1 = 0.55f)
                lineToRelative(dx = 1.17f, dy = 2.34f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 10.24f, y1 = 17.0f)
                horizontalLineToRelative(dx = 3.53f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.79f, dy1 = -1.11f)
                lineToRelative(dx = 1.17f, dy = -2.34f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.62f, y1 = 13.0f)
                horizontalLineToRelative(dx = 4.36f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.7f, y = 19.0f)
                curveToRelative(dx1 = 0.95f, dy1 = 2.1f, dx2 = 2.95f, dy2 = 3.0f, dx3 = 6.3f, dy3 = 3.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineToRelative(dy = -4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.27f, dx2 = -1.46f, dy2 = -6.35f, dx3 = -5.0f, dy3 = -6.87f)
                moveToRelative(dx = -10.0f, dy = 0.0f)
                curveTo(x1 = 3.46f, y1 = 4.65f, x2 = 2.0f, y2 = 6.73f, x3 = 2.0f, y3 = 11.0f)
                verticalLineToRelative(dy = 4.0f)
            }
        }.build().also { _directInbox = it }
    }

@Suppress("ObjectPropertyName")
private var _directInbox: ImageVector? = null
