package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentFilter: ImageVector
    get() {
        val current = _documentFilter
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DocumentFilter",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.35f, y = 2.0f)
                horizontalLineToRelative(dx = 8.9f)
                arcToRelative(a = 1.36f, b = 1.36f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.35f, dy1 = 1.35f)
                verticalLineToRelative(dy = 1.48f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.67f, dy1 = 1.55f)
                lineToRelative(dx = -2.9f, dy = 2.56f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.67f, dy1 = 1.55f)
                verticalLineToRelative(dy = 2.9f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = -0.27f, dy2 = 0.94f, dx3 = -0.61f, dy3 = 1.15f)
                lineToRelative(dx = -0.94f, dy = 0.61f)
                curveTo(x1 = 6.93f, y1 = 15.69f, x2 = 5.72f, y2 = 15.08f, x3 = 5.72f, y3 = 14.0f)
                verticalLineToRelative(dy = -3.57f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.54f, dy1 = -1.42f)
                lineToRelative(dx = -2.56f, dy = -2.7f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.61f, dy1 = -1.35f)
                verticalLineTo(y = 3.41f)
                arcTo(horizontalEllipseRadius = 1.36f, verticalEllipseRadius = 1.36f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 3.35f, y1 = 2.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 12.0f)
                verticalLineToRelative(dy = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.12f, dx2 = -0.78f, dy2 = -5.08f, dx3 = -2.59f, dy3 = -6.1f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.46f, dy1 = -0.66f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.0f, y = 13.0f)
                horizontalLineToRelative(dx = 5.0f)
                moveToRelative(dx = -7.0f, dy = 4.0f)
                horizontalLineToRelative(dx = 7.0f)
            }
        }.build().also { _documentFilter = it }
    }

@Suppress("ObjectPropertyName")
private var _documentFilter: ImageVector? = null
