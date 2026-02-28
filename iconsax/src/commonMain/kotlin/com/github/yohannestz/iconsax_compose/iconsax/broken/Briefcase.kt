package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Briefcase: ImageVector
    get() {
        val current = _briefcase
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Briefcase",
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
                moveTo(x = 21.37f, y = 14.0f)
                lineToRelative(dx = 0.34f, dy = -3.57f)
                curveTo(x1 = 21.97f, y1 = 7.99f, x2 = 21.27f, y2 = 6.0f, x3 = 17.0f, y3 = 6.0f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -4.27f, dy1 = 0.0f, dx2 = -4.97f, dy2 = 1.99f, dx3 = -4.7f, dy3 = 4.43f)
                lineToRelative(dx = 0.75f, dy = 8.0f)
                curveTo(x1 = 3.26f, y1 = 20.39f, x2 = 3.98f, y2 = 22.0f, x3 = 8.0f, y3 = 22.0f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 4.02f, dy1 = 0.0f, dx2 = 4.74f, dy2 = -1.61f, dx3 = 4.95f, dy3 = -3.57f)
                moveTo(x = 8.0f, y = 6.0f)
                verticalLineTo(y = 5.2f)
                curveTo(x1 = 8.0f, y1 = 3.43f, x2 = 8.0f, y2 = 2.0f, x3 = 11.2f, y3 = 2.0f)
                horizontalLineToRelative(dx = 1.6f)
                curveTo(x1 = 16.0f, y1 = 2.0f, x2 = 16.0f, y2 = 3.43f, x3 = 16.0f, y3 = 5.2f)
                verticalLineTo(y = 6.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.0f, y = 13.0f)
                verticalLineToRelative(dy = 1.02f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.09f, dx2 = -0.01f, dy2 = 1.98f, dx3 = -2.0f, dy3 = 1.98f)
                curveToRelative(dx1 = -1.98f, dy1 = 0.0f, dx2 = -2.0f, dy2 = -0.88f, dx3 = -2.0f, dy3 = -1.97f)
                verticalLineTo(y = 13.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.0f, dx2 = 0.0f, dy2 = -1.0f, dx3 = 1.0f, dy3 = -1.0f)
                horizontalLineToRelative(dx = 2.0f)
                curveToRelative(dx1 = 1.0f, dy1 = 0.0f, dx2 = 1.0f, dy2 = 0.0f, dx3 = 1.0f, dy3 = 1.0f)
                moveToRelative(dx = 7.65f, dy = -2.0f)
                arcTo(horizontalEllipseRadius = 16.5f, verticalEllipseRadius = 16.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.0f, y1 = 14.02f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.62f, y = 11.27f)
                arcTo(horizontalEllipseRadius = 16.0f, verticalEllipseRadius = 16.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 10.0f, y1 = 14.03f)
            }
        }.build().also { _briefcase = it }
    }

@Suppress("ObjectPropertyName")
private var _briefcase: ImageVector? = null
