package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReceiptEdit: ImageVector
    get() {
        val current = _receiptEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ReceiptEdit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.54f, y = 21.94f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.6f, dy1 = -0.3f)
                lineToRelative(dx = -1.01f, dy = -1.35f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.79f, dy1 = -0.46f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.3f, y1 = 20.2f)
                curveToRelative(dx1 = -1.45f, dy1 = 1.55f, dx2 = -2.55f, dy2 = 1.42f, dx3 = -3.08f, dy3 = 1.22f)
                curveToRelative(dx1 = -0.54f, dy1 = -0.21f, dx2 = -1.45f, dy2 = -0.9f, dx3 = -1.45f, dy3 = -3.12f)
                verticalLineTo(y = 7.04f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.44f, dx2 = 1.28f, dy2 = -5.79f, dx3 = 5.47f, dy3 = -5.79f)
                horizontalLineToRelative(dx = 7.55f)
                curveToRelative(dx1 = 4.19f, dy1 = 0.0f, dx2 = 5.47f, dy2 = 1.35f, dx3 = 5.47f, dy3 = 5.79f)
                verticalLineToRelative(dy = 4.26f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineTo(y = 7.04f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.61f, dx2 = -0.63f, dy2 = -4.29f, dx3 = -3.97f, dy3 = -4.29f)
                horizontalLineTo(x = 8.24f)
                curveToRelative(dx1 = -3.34f, dy1 = 0.0f, dx2 = -3.97f, dy2 = 0.68f, dx3 = -3.97f, dy3 = 4.29f)
                verticalLineTo(y = 18.3f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.05f, dx2 = 0.26f, dy2 = 1.63f, dx3 = 0.5f, dy3 = 1.72f)
                curveToRelative(dx1 = 0.18f, dy1 = 0.07f, dx2 = 0.67f, dy2 = -0.03f, dx3 = 1.43f, dy3 = -0.84f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.02f, dy1 = -0.85f)
                arcToRelative(a = 2.6f, b = 2.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.91f, dy1 = 1.06f)
                lineToRelative(dx = 1.02f, dy = 1.35f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.61f, dy1 = 1.2f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 7.75f)
                horizontalLineTo(x = 8.0f)
                curveTo(x1 = 7.59f, y1 = 7.75f, x2 = 7.25f, y2 = 7.41f, x3 = 7.25f, y3 = 7.0f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 6.25f, x2 = 8.0f, y2 = 6.25f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 16.41f, y1 = 7.75f, x2 = 16.0f, y2 = 7.75f)
                moveToRelative(dx = -1.0f, dy = 4.0f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 8.59f, y1 = 10.25f, x2 = 9.0f, y2 = 10.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -0.18f, dy = 10.03f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = -0.4f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.38f, dy1 = -1.23f)
                lineToRelative(dx = 0.19f, dy = -1.35f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.51f, dy1 = -1.02f)
                lineToRelative(dx = 3.54f, dy = -3.54f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.46f, dy1 = -0.78f)
                quadToRelative(dx1 = 0.94f, dy1 = -0.09f, dx2 = 1.82f, dy2 = 0.78f)
                quadToRelative(dx1 = 0.87f, dy1 = 0.88f, dx2 = 0.78f, dy2 = 1.82f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.78f, dy1 = 1.46f)
                lineToRelative(dx = -3.54f, dy = 3.54f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.02f, dy1 = 0.51f)
                lineToRelative(dx = -1.35f, dy = 0.2f)
                close()
                moveToRelative(dx = 4.49f, dy = -6.83f)
                horizontalLineToRelative(dx = -0.03f)
                quadToRelative(dx1 = -0.22f, dy1 = 0.03f, dx2 = -0.54f, dy2 = 0.35f)
                lineToRelative(dx = -3.54f, dy = 3.54f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.08f, dy1 = 0.17f)
                lineToRelative(dx = -0.18f, dy = 1.25f)
                lineToRelative(dx = 1.25f, dy = -0.18f)
                lineToRelative(dx = 0.17f, dy = -0.09f)
                lineToRelative(dx = 3.54f, dy = -3.54f)
                quadToRelative(dx1 = 0.32f, dy1 = -0.33f, dx2 = 0.35f, dy2 = -0.54f)
                curveToRelative(dx1 = 0.02f, dy1 = -0.2f, dx2 = -0.18f, dy2 = -0.44f, dx3 = -0.35f, dy3 = -0.6f)
                curveToRelative(dx1 = -0.16f, dy1 = -0.17f, dx2 = -0.39f, dy2 = -0.36f, dx3 = -0.59f, dy3 = -0.36f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.92f, y = 18.25f)
                lineToRelative(dx = -0.2f, dy = -0.03f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.74f, dy1 = -2.74f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.52f, dy1 = -0.93f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.92f, dy1 = 0.52f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.7f, dy1 = 1.7f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.2f, dy1 = 1.48f)
            }
        }.build().also { _receiptEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _receiptEdit: ImageVector? = null
